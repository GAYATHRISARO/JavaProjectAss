package com.shristi.training;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int j;
		  for(int i=1;i<=5;i++)
		  {
		   for(j=5;j>i;j--)
		   {   
		    System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++)
		    {
		     System.out.print(j+" ");
		     }
		    System.out.println( );
		   } 
		  s.close();
	}
}
