package com.shristi.training;
import java.util.Scanner;
public class RevArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]rev=new int[5];
		for(int j=0;j<rev.length;j++)
		{
			rev[j]=s.nextInt();
		}
		for(int i=rev.length-1;i>=0;i--)
		{
			    System.out.println("Reverse of an array:"+rev[i]+"\t");
		}
      s.close();
	}

}
