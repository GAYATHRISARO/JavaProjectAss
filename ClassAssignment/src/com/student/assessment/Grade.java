package com.student.assessment;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		System.out.println("Enter the student name:");
	    String name=s.next();
		System.out.println("Enter the student id :");
		int id=s.nextInt();
		System.out.println("Get the marks :");
		int[] marks=new int[n];
		for(int i=0;i<n;i++)
		{
			marks[i]=s.nextInt();
		}
		

		Student st=new Student(name,id);
		st.getDetails();
		st.getGrades(marks);
		
		s.close();
	}

}
