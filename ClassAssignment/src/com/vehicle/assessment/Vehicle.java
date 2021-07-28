package com.vehicle.assessment;

public class Vehicle {
 
	String name,model;
	double price;
	
	public Vehicle(String name, String model, double price) {
		
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	void getDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Model-- "+model);
		System.out.println("Price of the vehicle-- "+price);
	}
	
}
