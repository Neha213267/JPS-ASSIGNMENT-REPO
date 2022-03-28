package com.springSecurityA23;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("user")
        .password("$2a$12$Taygfu9TUJCdxmcvr5b4R.ZD50Ax.C8tXnrz2K0VwakHl5Uxvypi")  //user
        .roles("USER")
        .and()
        .withUser("admin")
        .password("$2a$12$lFU2JUKovLqMmHonmNwtzOCqLJ4yPHbTaRrOgYesYrxIMSGhoMJbW") //admin
        .roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
         .antMatchers("/user").hasAnyRole("USER","ADMIN")
         .antMatchers("/").permitAll()
         .and().formLogin().permitAll().and()
         .logout()
         .permitAll()
         .and()
          .rememberMe()
          .key("Cookie") // keyname
           .tokenValiditySeconds(60*60*3); //token validity for 3 hr 
	}
	
	@Bean
    public PasswordEncoder getPasswordEncoder(){

        return new BCryptPasswordEncoder();
    }
}
