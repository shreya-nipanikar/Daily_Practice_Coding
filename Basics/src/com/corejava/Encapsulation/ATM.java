package com.corejava.Encapsulation;

public class ATM {
	
	private int cardNumber;
	private int pin;
	private int balance;
	
	public ATM(int cardNumber, int pin, int balance) {
		super();
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.balance = balance;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean validatePin(int UserPin) {
		
		return UserPin == pin;
		
	}
	
	public void withdraw(int UserPin, int amount) {
		
		if(validatePin(UserPin)) {
			balance -= amount;
			System.out.println("Transaction Successful");
			System.out.println("Balance : "+balance);
		} else {
			System.out.println("Invalid Pin");
		}
		
	}
	

}
