package com.fabric.customer;

import com.fabric.check.FabricCheck;
import com.fabric.exception.*;

public class FabMain {

	public static void main(String[] args)  {
		FabricCheck fcheck=new FabricCheck();
		System.out.println(fcheck.getAll());
		try {
			System.out.println(fcheck.getByColor("Yellow"));
		} catch (ColorNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(fcheck.getByPrice(800));
		} catch (FabricNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(fcheck.getByFname("Rayon"));
		} catch (FabricNotAvailableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(fcheck.getById(8));
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}


	}

}
