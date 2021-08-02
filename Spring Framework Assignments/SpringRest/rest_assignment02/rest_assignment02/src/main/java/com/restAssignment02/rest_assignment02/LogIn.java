package com.restAssignment02.rest_assignment02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogIn {
	@Autowired
	private LogInService service;
	
	@RequestMapping("/login/{user}/{pass}")
	public String getLogin(@PathVariable String user,String pass)
	{
		return service.getLogin("kpcreddy","kpc");
	}

}
