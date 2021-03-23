package tn.dari.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import tn.dari.spring.entity.User;
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

//	    @Override
//	    protected void configure(final HttpSecurity http) throws Exception {
//	    	http
//	        .csrf().disable()
//	        .authorizeRequests()
//	        .antMatchers("/admin/**").hasRole("ADMIN")
//	        .antMatchers("/anonymous*").anonymous()
//	        .antMatchers("/login*").permitAll()
//	        .anyRequest().authenticated()
//	        .and()
//	        .formLogin()
//	        .loginPage("/login.html")
//	        .loginProcessingUrl("/perform_login")
////	        .defaultSuccessUrl("/homepage.html", true)
//	        .failureUrl("/login.html?error=true")
//	        .failureHandler(authenticationFailureHandler())
//	        .and()
//	        .logout()
////	        .logoutUrl("/perform_logout")
//	        .deleteCookies("JSESSIONID")
//	        .logoutSuccessHandler(logoutSuccessHandler());
//	    }
	//    
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
//	    	PasswordEncoder encoder = 
//	          PasswordEncoderFactories.createDelegatingPasswordEncoder();
			
			
			User user = userService.retrieveUserByLogin("gaston");
			auth.inMemoryAuthentication().withUser(user.getLogin())
//	          .password(encoder.encode("password"))
					.password(passwordEncoder().encode(user.getPassword())).roles("CUSTOMER").and().withUser("admin")
//	          .password(encoder.encode("admin"))
					.password(passwordEncoder().encode("admin")).roles("USER", "ADMIN");
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/anonymous*").anonymous().antMatchers("/login*").permitAll().anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/success.html", true)
					.and().httpBasic();

			
	        
		}
		

	}



