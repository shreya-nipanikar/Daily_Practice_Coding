package com.corejava.dayThreeAssignments;

public class BankAcc {
	
	void CalculateBalance(int initialBalance)
	{
		System.out.println("Initial Balance : "+initialBalance);
	}
	
	void CalculateBalance(int initialBalance,int amount) {
		int deposit = initialBalance + amount;
		System.out.println("Total amount :"+deposit);
	}
	
	void CalculateBalance(int initialBalance,int amount, int interest) {
		int deposit = initialBalance + amount;
		double interestRate = (deposit * interest)/100;
		System.out.println("InterestRate :"+interestRate);
	}

}
