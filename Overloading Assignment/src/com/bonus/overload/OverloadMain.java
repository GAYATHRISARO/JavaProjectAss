package com.bonus.overload;
import java.util.Scanner;
public class OverloadMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=s.next();
		String destination=s.next();
		if(destination.equals("Programmer"))
		{
		  Employee e=new Employee(name,destination);
		  System.out.println(e.calcBonus(10000.89));
		}
		else if(destination.equals("Manager"))
		{
			Employee e2=new Employee(name,destination);
			System.out.println(e2.calcBonus(15000.78,5000.90));
		}
		else if(destination.equals("Director"))
		{
		  Employee e3=new Employee(name,destination);
		  System.out.println(e3.calcBonus(20000,10000,15000));
		}
		else
		{
			System.out.println("NO MATCH...");
		}
		s.close();
	}

}
