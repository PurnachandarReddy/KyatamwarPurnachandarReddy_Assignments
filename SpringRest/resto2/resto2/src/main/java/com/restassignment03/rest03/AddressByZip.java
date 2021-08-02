package com.restassignment03.rest03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressByZip {
	@Autowired
	AddressService addr;
	
	@RequestMapping("/address/{zip}")
	public Address getAddress(@PathVariable Integer zip)
	{
		return addr.getAddress(zip);
	}

}
