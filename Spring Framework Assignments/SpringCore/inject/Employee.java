package com.annotations.inject;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Address address;
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
