package tn.dari.spring.config;

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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import tn.dari.spring.service.UserDetailServiceImpl;
import tn.dari.spring.service.UserService;



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



	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http.authorizeRequests().antMatchers("/Customer").access("hasAnyRole('Customer', 'Admin')");
		
		http.authorizeRequests().antMatchers("/admin").access("hasRole('Admin')");

		http.authorizeRequests()
//			.antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/anonymous*").anonymous().antMatchers("/login*").permitAll()
//				.antMatchers(HttpMethod.DELETE, "/remove-user/{user-id}").permitAll()
//				.antMatchers(HttpMethod.PUT, "/modify-user").permitAll().antMatchers(HttpMethod.POST, "/add-user")
				
////				.antMatchers(HttpMethod.GET, "/retrieve-all-users/{user-id}").permitAll()
//				.antMatchers(HttpMethod.GET, "/retrieveUserByLogin/{login}").permitAll()
//				.antMatchers(HttpMethod.GET, "/retrieveUserByEmail/{email}").permitAll()
	//	.antMatchers(HttpMethod.GET, "/retrieve-all-users").permitAll()
		.antMatchers(HttpMethod.GET, "/adses").permitAll()
		.antMatchers(HttpMethod.GET, "/getAllAds").permitAll()

		.antMatchers(HttpMethod.GET, "/getAdsById/{id}").permitAll()
		.antMatchers(HttpMethod.POST, "/photos/{id}").permitAll()
		.antMatchers(HttpMethod.POST, "/postAds").permitAll()
		.antMatchers(HttpMethod.PUT, "/putAds/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/putAds").permitAll()

		.antMatchers(HttpMethod.DELETE, "/deleteAds/{id}").permitAll()
		

		//.antMatchers(HttpMethod.POST, "/add-user").permitAll().antMatchers(HttpMethod.POST, "/authenticate")
		//		.permitAll().antMatchers("/admin/**").hasRole("ADMIN").antMatchers("/anonymous*").anonymous()
			//	.antMatchers("/login*").permitAll() // obligatoire
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
