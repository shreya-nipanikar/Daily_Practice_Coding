package com.corejava.constructor;

public class BankAcc {
	
	String accNumber;
	String accholderName;
	int balance;
	
	 public BankAcc(String accNumber, String accholderName, int balance) {
		this.accNumber = accNumber;
		this.accholderName = accholderName;
		this.balance = balance;

	}
	
	public void displayDetails() {
		System.out.println("Account Number :c" +accNumber);
		System.out.println("Account HolderName : "+accholderName);
		System.out.println("Account balance : "+balance);
	}
	
	

}
