package com.shristi.training;
import java.util.Scanner;
public class SquRoot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] sq=new int[n];
	    int[] op=new int[9];
	    int val=0;
		for(int i=0;i<n;i++)
		{
			sq[i]=s.nextInt();
	    	int root=sq[i]*sq[i];
	    	 op[val++]=root;
	     }
		for(int j=0;j<val;j++)
		{
        System.out.println("The square root is "+op[j]);
		}
        s.close();
	}

}
