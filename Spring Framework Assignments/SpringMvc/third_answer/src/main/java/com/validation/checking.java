package com.validation;

public class checking {
	
	public boolean validateUser(String name , String password) {
		return name.equalsIgnoreCase("kpcreddy") && password.equalsIgnoreCase("kpc");
	}

}