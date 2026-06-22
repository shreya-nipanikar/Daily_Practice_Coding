package com.corejava.dayTwoAssignments;

public class SavingsAccount extends BankAccount {
	
	double interestRate;
	
	 public SavingsAccount(String accountNumber, String accountHolderName,
             double balance, double interestRate) {
		     super(accountNumber, accountHolderName, balance);
		     this.interestRate = interestRate;
	 	}

	
	
	 		void calculateInterest() {
	 			double interest = balance * interestRate /100;
	 			System.out.println("Interest : "+interest);
	 		}

	
	
	

}
