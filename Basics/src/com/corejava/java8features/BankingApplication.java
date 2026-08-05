package com.corejava.java8features;

public class BankingApplication {
	
	int amount;
	int interestRate;
	int time;
	
	public BankingApplication(int amount, int interestRate, int time) {
		this.amount = amount;
		this.interestRate = interestRate;
		this.time = time;
	}

	public int getAmount() {
		return amount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public int getTime() {
		return time;
	}	

}
