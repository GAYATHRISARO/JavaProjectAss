package com.bank.ass;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("In savings Withdraw---");
		balance -=amount-200;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit more in Savings---");
		balance +=amount+200;
	}

}
