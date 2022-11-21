package com.fundamental;

public class InSuficientFund extends Exception{

	double amount;

	public InSuficientFund(double amount) {
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
}
