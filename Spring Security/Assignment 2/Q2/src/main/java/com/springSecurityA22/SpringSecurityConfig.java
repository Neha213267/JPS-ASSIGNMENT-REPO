package com.springSecurityA22;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user")
		.password("$2a$10$CvcT179sWowOBH5VulcyN.p8b91dngWYr/W5oTh2JxZjfzqArPcMq")//user
		.roles("USER").and()
		.withUser("admin")
		.password("$2a$10$Qar7LZqWKcFbBxdljY.WDO4Aj1lVvO9Jp9k7QoJttwm5xyGbGH9H6")//admin
		.roles("ADMIN");
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
        .antMatchers("/user").hasAnyRole("USER","ADMIN")
        .antMatchers("/").permitAll()
        .and().formLogin().permitAll();
	}
	
	@Bean
    public PasswordEncoder getPasswordEncoder(){

        return new BCryptPasswordEncoder();
    }

	


}
