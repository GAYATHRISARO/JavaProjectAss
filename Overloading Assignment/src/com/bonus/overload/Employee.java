package com.bonus.overload;

public class Employee {
String name,destination;
   //int salary=0;
public Employee(String name, String destination) {
	super();
	this.name = name;
	this.destination = destination;
}  
   
    double calcBonus(double basicAllowance)
   {  
	   System.out.println("Employee name-- "+name);
	   System.out.println("Destination\n"+destination);
	   double bonus=(basicAllowance)*0.08;
	   return bonus;
   }
    double calcBonus(double basicAllowance,double carAllowance)
   {
	   System.out.println("Employee name-- "+name);
	   System.out.println("Destination\n"+destination);
	   double bonus=(basicAllowance+carAllowance)*
			   0.020;
	   return bonus;
   }
   double calcBonus(double basicAllowance,double carAllowance,double houseAllowance)
   {
	   System.out.println("Employee name-- "+name);
	   System.out.println("Destination\n"+destination);
	   double bonus=(basicAllowance+carAllowance+houseAllowance)*0.055;
	   return bonus;
	   
   }
   
}
