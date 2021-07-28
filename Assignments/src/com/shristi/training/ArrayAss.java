package com.shristi.training;
import java.util.Scanner;
public class ArrayAss {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int a[]=new int[num];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int[] even=new int[4];
		int[] odd=new int[4];
		int x=0,y=0;
		for(int val:a)
		{
			if(val%2==0)
			{
				 even[x++]=val;
	
			}
			else
			{
				 odd[y++]=val;
			}
		}
		
		System.out.println("Even num");
		for(int i=0;i<x;i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("Odd num");
		for(int j=0;j<y;j++)
		{
			 System.out.println(odd[j]);
		}
		s.close();
	}


}
