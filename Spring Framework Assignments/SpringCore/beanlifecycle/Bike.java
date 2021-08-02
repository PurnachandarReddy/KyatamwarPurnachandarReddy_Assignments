package com.beanlifecycle;

public class Bike {

	private double price;

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price..");
		this.price = price;
	}

	public Bike(double price) {
		super();
		this.price = price;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
