package com.restassignment03.rest03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	List<Address> list=new ArrayList<>(Arrays.asList(
			new Address("Telanaga","Hyderabad","India",504001),
			new Address("MP","Bhopal","India",50000),
			new Address("UP","Lucknow","India",40000),
			new Address("MH","Mumbai","USA",30000)
			));
	

	public Address getAddress(Integer zip) {
		
		return list.stream().filter(i->i.getZip().equals(zip)).findFirst().get();
	}
	
	

}
