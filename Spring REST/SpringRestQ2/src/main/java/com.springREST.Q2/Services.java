package com.springREST.Q2;


	import org.springframework.stereotype.Service;
	

	@Service
	public class Services
	{
		public String validate(String username,String Password)
		{
	        if (username.equals("NEHA") && Password.equals("neha"))
	        {
	            return "Valid User";
	        }
	        else
	        {
	        	return "Invalid User";
	        }
	    }

}
