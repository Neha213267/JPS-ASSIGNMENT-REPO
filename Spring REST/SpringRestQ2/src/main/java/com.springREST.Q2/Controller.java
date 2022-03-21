package com.springREST.Q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	User user = new User("NEHA","neha");
	
	@GetMapping("/user")
	public User getUser()
	{
		return user;
	}

	    @PostMapping("/login")
	    public String login(@RequestBody User user) {

	        System.out.println(user);
	        if (this.user.getUsername().equals(user.getUsername()) && this.user.getPassword().equals(user.getPassword())) {
	            return "Valid User";
	        }
	        return "Invalid User";
	    }
}
