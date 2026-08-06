package com.corejava.java8featuresParttwo;

interface Payment{
	
	default String paymentDetails(String details) {
		return "Payment Details: "+details;
	}
	
	
}

class UPIPayment implements Payment{	
	
}

public class FinancePay implements Payment{
	
	@Override
	public String paymentDetails(String details) {
		return "This is paid by : "+details;
	}

	public static void main(String[] args) {
		FinancePay FP = new FinancePay();
		
		System.out.println(FP.paymentDetails("Credit"));
		
		UPIPayment Up = new UPIPayment();
		System.out.println(Up.paymentDetails("UPI"));
		
      
	}

}
