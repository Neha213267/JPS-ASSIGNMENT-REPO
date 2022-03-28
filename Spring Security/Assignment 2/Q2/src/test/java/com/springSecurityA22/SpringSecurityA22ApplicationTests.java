package com.springSecurityA22;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityA22ApplicationTests {

	@Test
	public void encodePassword() {
		String rawPassword="admin";
		
		BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		boolean matched=passwordEncoder.matches("admin", encodedPassword);
		
	    assertTrue(matched);
	//void contextLoads() {
	}

}
