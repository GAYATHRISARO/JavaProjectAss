package com.bank.assessment;

public class BaMain {

	public static void main(String[] args) {
		Bank b=new Bank(20000);
		b.deposit(800);
		System.out.println("Balance after deposit "+b.getBalance());
		b.withDraw(200);
		System.out.println("Balance after withdraw "+b.getBalance());
		
		
	}

}
