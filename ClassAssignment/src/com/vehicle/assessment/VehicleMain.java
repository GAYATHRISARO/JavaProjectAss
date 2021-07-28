package com.vehicle.assessment;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle("Tom","Honda",500000);
		v.getDetails();

		Vehicle v2=new Vehicle("Sam","Indica",300000);
		v2.getDetails();

	}

}
