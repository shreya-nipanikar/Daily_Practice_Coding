package com.corejava.Encapsulation;

public class CreditCard {
	
	private String cardNumber;
	private int creditLimit;
	private int currentUsage;
	
	public CreditCard(String cardNumber, int creditLimit, int currentUsage) {
		super();
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.currentUsage = currentUsage;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getCurrentUsage() {
		return currentUsage;
	}

	public void setCurrentUsage(int currentUsage) {
		this.currentUsage = currentUsage;
	}
	
	public void CreditDetails() {
		 
		if (currentUsage <= creditLimit) {
			System.out.println("Your allowed to spend");
		} else {
			System.out.println("Your currentUsage is high. You Cannot Spend");
		}
		
		System.out.println("Your available credit :"+creditLimit);
	}
	
   
}
