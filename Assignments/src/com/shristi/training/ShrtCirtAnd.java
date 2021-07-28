package com.shristi.training;
import java.util.Scanner;
public class ShrtCirtAnd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if(x>y && x>z) 
        {
        	System.out.println("X is greater");
        }
        else if(y>z)
        {
        	System.out.println("Y is greater");
        }
        else
        {
        	System.out.println("Z is greater");
        }
        s.close();
	}

}
