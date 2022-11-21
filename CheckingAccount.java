package com.fundamental;

public class CheckingAccount {

	int acno;
	double balance=0;
	public CheckingAccount(int acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws InSuficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSuficientFund(needs);
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance : "+this.balance);
	}
	
}
