package com.rest.assignments.rest_assignment01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!!...";
		
		
	}
	

}
