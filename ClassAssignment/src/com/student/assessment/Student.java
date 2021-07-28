package com.student.assessment;

public class Student {
	String sname;
	int id;

	public Student(String sname, int id) {
		super();
		this.sname = sname;
		this.id = id;
	}

	void getDetails() {
		System.out.println("Name of the student is " + sname );
		System.out.println("id-- " + id);
		
	}

	void getGrades(int[] marks) {
		int sum = 0, avg = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
			avg = sum / marks.length;
		}
		if (avg >= 90) {
			 System.out.println("Grade is A");
		} else if (avg < 90 && avg >= 80) {
			System.out.println("Grade is B");
		} else {
			System.out.println("Grade is C");;
		}
	}
}
