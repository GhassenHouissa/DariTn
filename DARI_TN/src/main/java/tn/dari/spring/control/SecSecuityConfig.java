package tn.dari.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import tn.dari.spring.service.UserService;
import tn.dari.spring.util.UserAuthenticationFailureHandler;
import tn.dari.spring.util.UserLogoutSuccessHandler;


	@Configuration
	@EnableWebSecurity
	public class SecSecuityConfig extends WebSecurityConfigurerAdapter {
		
		@Autowired
		private UserService userService;
		
		
		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}

		@Bean
		public AuthenticationFailureHandler authenticationFailureHandler() {
			return new UserAuthenticationFailureHandler();
		}

		@Bean
		public LogoutSuccessHandler logoutSuccessHandler() {
			return new UserLogoutSuccessHandler();
		}

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
			
			//User user = userService.retrieveUserByLogin("gaston"); user.getLogin()  user.getPassword()
			auth.inMemoryAuthentication().withUser("USER")
//	          .password(encoder.encode("password"))
					.password(passwordEncoder().encode("PASSWORD")).roles("CUSTOMER").and().withUser("admin")
//	          .password(encoder.encode("admin"))
					.password(passwordEncoder().encode("admin")).roles("USER", "ADMIN");
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
//			http.cors().and().csrf().disable().authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/anonymous*").anonymous().antMatchers("/login*").permitAll().antMatchers(HttpMethod.POST, "/add-user").permitAll().anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/success.html", true)
//					.and().httpBasic();

			http.cors().and().csrf().disable()
			.authorizeRequests()
			.antMatchers(HttpMethod.DELETE,"/servlet/remove-user/{user-id}").permitAll()
			.antMatchers(HttpMethod.PUT,"/servlet/modify-user").permitAll()
			.antMatchers(HttpMethod.PUT,"/modify-user").permitAll()
			.antMatchers(HttpMethod.POST,"/servlet/add-user").permitAll()
			.antMatchers(HttpMethod.POST,"/add-user").permitAll()
			.antMatchers(HttpMethod.GET,"/retrieve-all-users").permitAll()
			.antMatchers(HttpMethod.GET,"/servlet/retrieve-all-users").permitAll()
			.antMatchers(HttpMethod.GET,"/servlet/retrieve-all-users/{user-id}").permitAll()
			.antMatchers(HttpMethod.GET,"/retrieve-all-users/{user-id}").permitAll()
			.anyRequest().authenticated()
			.and()
            .httpBasic();
	        
		}
		

	}



