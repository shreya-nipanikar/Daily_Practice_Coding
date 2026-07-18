package com.corejava.Encapsulation;

public class BankAcc {
	
	private int accNumber;
	private String accName;
	private int balance;
	
	public BankAcc(int accNumber, String accName, int balance) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		
		balance += amount;
		System.out.println("Updated Amout : " +balance);
		
	}
	
	public void withdraw( int amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Your Balance : "+balance);
		} else {
			System.out.println("Insufficient Balance");
		}
		
	}
	
	
	
	
	

}
