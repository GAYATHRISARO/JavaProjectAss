package com.bank.assessment;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public void withDraw(int x) {
		balance -= x;
	}

	public void deposit(int x) {
		balance += x;
	}

	public double getBalance() {
		return balance;

	}

}
