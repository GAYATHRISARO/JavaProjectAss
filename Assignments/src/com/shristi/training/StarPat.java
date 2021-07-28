package com.shristi.training;
import java.util.Scanner;
public class StarPat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int val=s.nextInt();
		int num=1;
		  for(int i=1;i<=5;i++)
		  {
		   for(int j=5;j>=i;j--)
		   {   
		    System.out.print(" ");
		    }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(num+" ");
			   num++;
		   }
		    System.out.println( );
		   } 
		  s.close();
	}
}
