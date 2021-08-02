package com.abs.ass;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" 1.Savings\n 2.Current\n ");
		System.out.println("Enter the account type: ");
		int acc=s.nextInt();
		System.out.println("Enter the amount :");
		int amount=s.nextInt();
		Account act;
		switch(acc)
	   {
		case  1:
			 act=new Savings(2000);
			 System.out.println(act.getBalance());
			 if(act.getBalance()>=amount)
			   {
				act.withdraw(amount);
				System.out.println("Balance after withdraw "+act.getBalance());
			   }
			 else if(act.getBalance()<=0 || act.getBalance()>=amount)
			 {		
				 act.deposit(amount);
				 System.out.println("Balance after deposit "+act.getBalance());
			 }
			break;
		case 2:
			 act=new Current(4000);
			 if(act.getBalance()>=amount)
			   {
				act.withdraw(amount);
				System.out.println("Balance after withdraw "+act.getBalance());
			   }
			 else if(act.getBalance()<0 || act.getBalance()>=amount)
			 {
				act.deposit(amount);
				System.out.println("Balance after deposit "+act.getBalance());
			 }
			break;
		default:
			System.out.println("No account is selected..."+"\n"+"Back to home");
			break;
	   }
		s.close();

	}

}
