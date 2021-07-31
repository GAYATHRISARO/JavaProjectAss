package com.bank.ass;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw from current account **********");
		balance -=amount;
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit into current account***********");
		balance +=amount;
	}

}
