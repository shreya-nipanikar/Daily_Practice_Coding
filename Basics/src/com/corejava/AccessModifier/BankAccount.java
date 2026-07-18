package com.corejava.AccessModifier;

public class BankAccount {
	
	private int accountNumber;
	private int balance;
	
	public void setAccountDeatils(int accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
