package com.springRESTSecurityAuthentication;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HelloController {
		
		@GetMapping("/")
		public String SayHi() {
			return "WELCOME";// Accessible by everybody
		}
        
		@GetMapping("/user")
		public String user() {
			return "WELCOME user ";// Accessible only by user and admin
		}
        
		@GetMapping("/admin")
		public String admin() {
			return "WELCOME admin";// accessible only by admin
		}


}
