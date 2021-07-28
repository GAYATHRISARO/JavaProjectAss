package com.shristi.training;

public class DupliArr {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=4;
		arr[1]=2;
		arr[2]=4;
		arr[3]=6;
		arr[4]=6;
		int ctr=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
		   {
			if(arr[i]==arr[j])
			{
				ctr++;
				System.out.println(arr[j]+" is duplicate");
			}
		   }
		}
		if(ctr >0)
		{
        System.out.println("The count of duplicate array is "+ctr);
		}
		else
		{
			System.out.println("No duplicates..");
		}
	}
}
