package com.security.assignment03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/")
	public String demo() {
		return "Hello Everyone";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello... user";
		
	}

	
	@GetMapping("/admin")
	public String admin() {
		return "Hello..admin";
		
	}


}