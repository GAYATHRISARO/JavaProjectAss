package com.shristi.training;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		
		String[] exisname=new String[] {"Tom","Ram","Sam","Bob"};
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the name to register:");
        String name=s.next();
        
        boolean ct=false;
        for(String res:exisname)
        {
          if(name.equals(res))
          {
        	System.out.println("Already registered!!");
        	ct=true;
        	break;
          }
        }
        if(ct == false)
        {
          System.out.print("You are registered");
        }
        else
        {
         System.out.println("Name is not unique");
        }
        s.close();
	}
}
