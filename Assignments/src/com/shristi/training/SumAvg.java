package com.shristi.training;
import java.util.Scanner;
public class SumAvg {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
	int sum=0;
    double avg=0;
 
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
    	 sum =sum+arr[i];
    	 avg=sum/n;
     }
     System.out.println("The Sum is "+sum);
     System.out.println("Average value is "+avg);
	s.close();
	}
}
