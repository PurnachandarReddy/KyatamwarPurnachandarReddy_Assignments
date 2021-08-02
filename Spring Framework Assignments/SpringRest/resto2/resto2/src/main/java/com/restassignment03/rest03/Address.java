package com.restassignment03.rest03;

public class Address {
	private String state;
	private String city;
	private String country;
	private Integer zip;
	
	public Address() {
	
	}

	public Address(String state, String city, String country, Integer zip) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", country=" + country + ", zip=" + zip + "]";
	}
	
	

}
