package com.shristi.training;
import java.util.Scanner;
public class UserName {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] username=new String[] {"24Sai","32Ram","21Sam","54Bob"};
        System.out.println("Enter the username to login:");
        String uname=s.next();
        
        boolean a=false;
        for(String r:username)
        {
          if(r.equals(uname))
          {
        	System.out.println("logged in as "+uname);
        	a=true;
        	break;
          }
        }
       if(a==false)
        {
          System.out.print("Invalid Username..");
        }
        else
        {
         System.out.println("You are logged in successfully");
        }
        s.close();

	}

}
