package com.security.security01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserlogIn {
	
	@RequestMapping("/hello")
	public String login()
	{
		return "Hello World";
	}
	
	

}