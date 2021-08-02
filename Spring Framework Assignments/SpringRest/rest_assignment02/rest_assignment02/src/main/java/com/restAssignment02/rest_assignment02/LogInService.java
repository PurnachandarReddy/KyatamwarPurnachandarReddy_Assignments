package com.restAssignment02.rest_assignment02;

import org.springframework.stereotype.Service;

@Service
public class LogInService {
	

	public String getLogin(String user, String pass) {
		if(user.equals("kpcreddy") && pass.equals("kpc"))
		{
			return "Valid User..";
		}
		else
		{
			return "Invalid User";
		}
	}

}
