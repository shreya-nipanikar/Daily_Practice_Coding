package com.corejava.abstractandinterface;

public abstract class Payment {
	
	abstract void makePayment(double amount);
	
}

class CardPayment extends Payment{

	@Override
	void makePayment(double amount) {
		System.out.println("This payment is paid by card : "+amount);
		
	}
	
}

class UPIPayment extends Payment{

	@Override
	void makePayment(double amount) {
		System.out.println("This payment is made by UPI : "+amount);
		
	}
	
	
}
