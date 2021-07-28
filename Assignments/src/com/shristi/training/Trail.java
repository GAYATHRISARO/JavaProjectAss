package com.shristi.training;
import java.util.Scanner;
public class Trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sc=s.nextLine();
		if(sc.equals("Sai"))
       {
	    System.out.println("Welcome"+sc);
       }
       else
       {
    	   System.out.println("Wrong user");
       }
		s.close();
	}

}
