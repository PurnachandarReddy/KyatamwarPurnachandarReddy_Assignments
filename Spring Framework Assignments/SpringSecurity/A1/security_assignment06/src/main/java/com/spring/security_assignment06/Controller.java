package com.spring.security_assignment06;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@RequestMapping("/")
	public String demo() {
		return "Hello Everyone";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Hello..User";
		
	}

	
	@RequestMapping("/admin")
	public String admin() {
		return "Hello..Admin";
		
	}

}