package com.bank.ass;

public class Account {
   double balance;
   
   public Account(double balance) {
	super();
	this.balance=balance;
}
void withdraw(double amount)
   {
	   System.out.println("Withdraw from account ");
	   balance -=amount;
   }
   void deposit(double amount)
   {
	   System.out.println("Deposit into account");
	   balance +=amount;
   }
   double getBalance()
   {
	   return balance;
   }
}
