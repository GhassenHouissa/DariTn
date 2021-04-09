package tn.dari.spring.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import tn.dari.spring.service.UserDetailServiceImpl;
import tn.dari.spring.service.UserService;
import tn.dari.spring.util.UserAuthenticationFailureHandler;
import tn.dari.spring.util.UserLogoutSuccessHandler;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecSecuityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;

	@Autowired
	private UserDetailServiceImpl userDetailsService;

	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

	@Autowired
	private JwtRequestFilter jwtRequestFilter;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Bean
	public AuthenticationFailureHandler authenticationFailureHandler() {
		return new UserAuthenticationFailureHandler();
	}

	@Bean
	public LogoutSuccessHandler logoutSuccessHandler() {
		return new UserLogoutSuccessHandler();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

	}

//		@Override
//		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//			
//			
//			auth.inMemoryAuthentication().withUser("USER")
//					.password(passwordEncoder().encode("PASSWORD")).roles("CUSTOMER").and().withUser("admin")
//					.password(passwordEncoder().encode("admin")).roles("USER", "ADMIN");
//		}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// /userInfo page requires login as ROLE_USER or ROLE_ADMIN.
		// If no login, it will redirect to /login page.
		http.authorizeRequests().antMatchers("/Customer").access("hasAnyRole('Customer', 'Admin')");
		// only for Admin;
		http.authorizeRequests().antMatchers("/admin").access("hasRole('Admin')");

		http.authorizeRequests()
//			.antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/anonymous*").anonymous().antMatchers("/login*").permitAll()
//				.antMatchers(HttpMethod.DELETE, "/remove-user/{user-id}").permitAll()
//				.antMatchers(HttpMethod.PUT, "/modify-user").permitAll().antMatchers(HttpMethod.POST, "/add-user")
//				.permitAll().antMatchers(HttpMethod.GET, "/retrieve-all-users").permitAll()
////				.antMatchers(HttpMethod.GET, "/retrieve-all-users/{user-id}").permitAll()
//				.antMatchers(HttpMethod.GET, "/retrieveUserByLogin/{login}").permitAll()
//				.antMatchers(HttpMethod.GET, "/retrieveUserByEmail/{email}").permitAll()
				.antMatchers(HttpMethod.POST, "/authenticate").permitAll()
				.antMatchers("/admin/**")
				.hasRole("ADMIN").antMatchers("/anonymous*").anonymous().antMatchers("/login*").permitAll() // obligatoire
																											// pour
																											// affichage
																											// page
																											// login
																											// default
				.anyRequest().authenticated().and().formLogin().permitAll()//
				.defaultSuccessUrl("/Welcom").and().logout().permitAll().and().cors().and().csrf().disable()
				
				// make sure we use stateless session; session won't be used to
				// store user's state.
				.exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		// Add a filter to validate the tokens with every request
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);


	}

}
