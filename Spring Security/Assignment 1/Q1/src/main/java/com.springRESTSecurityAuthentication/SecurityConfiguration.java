package com.springRESTSecurityAuthentication;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity //Tells spring this is a web security configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		//set configuration on auth object
		
		auth.inMemoryAuthentication()//This follows method chaining pattern
		.withUser("lele")
		.password("lele")
		.roles("USER")
		.and()
		.withUser("hoho")
		.password("hoho")
		.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder getPasswordEcoder() {
		return NoOpPasswordEncoder.getInstance();// derprecated as a warning to 
		                                         //user that it should not be used
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
}
