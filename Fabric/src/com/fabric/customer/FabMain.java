package com.fabric.customer;

import com.fabric.check.FabricCheck;
import com.fabric.exception.*;


public class FabMain {

	public static void main(String[] args) {
		FabricCheck fcheck = new FabricCheck();

		try 
		{
			System.out.println(fcheck.getByColor("Yellow"));
		try 
		{
			System.out.println(fcheck.getByPrice(800));
			try {
				System.out.println(fcheck.getByFname("Rayon"));
				try {
					System.out.println(fcheck.getById(8));
				}
				catch(IdNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
			catch(FabricNotAvailableException e2) {
				System.out.println(e2.getMessage());
			}
		}
		catch(FabricNotAvailableException e3) {
			System.out.println(e3.getMessage());
		}
		}
		catch(ColorNotFoundException e4)
		{
			System.out.println(e4.getMessage());
		}
	}
	

}
