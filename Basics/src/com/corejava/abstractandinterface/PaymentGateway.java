package com.corejava.abstractandinterface;

public interface PaymentGateway {
	
	void pay(double amount);
	

}


class CreditCardPayment implements PaymentGateway {

	@Override
	public void pay(double amount) {
		System.out.println("This payment is paid by credit card :" +amount);
		
	}
	
}


class NetBankingPayment implements PaymentGateway {

	@Override
	public void pay(double amount) {
		System.out.println("This is netbanking :"+amount);
		
	}
	
}
