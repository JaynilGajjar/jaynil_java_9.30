package com.fundamental;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount(1, 1000);
		double amount;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("******************************************");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("******************************************");
			
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			System.out.println("******************************************");
			
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("******************************************");
			}
			else if(choice==2) 
			{
				System.out.print("Enter Withdraw Amount : ");
				amount=sc.nextDouble();
				try{
					c.withdraw(amount);
					System.out.println("******************************************");
				}catch(InSuficientFund e) {
					System.out.println("Sorry You Need Another "+e.getAmount()+" Rs.");
					System.out.println("******************************************");
				}
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("******************************************");
			}
			else
			{
				System.out.println("Thank You For Using Service");
				System.out.println("******************************************");
				break;
			}
		}while(true);
	}
}
