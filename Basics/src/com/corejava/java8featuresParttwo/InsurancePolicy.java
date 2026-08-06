package com.corejava.java8featuresParttwo;

interface policy {
	
	public double CalPremium(double amount);
	
	default void RenewalReminder() {
		System.out.println("Hey! Your Next Renewal date is coming soon!");
		System.out.println("Please keep enough balance in account.");
	}
	
	
}

public class InsurancePolicy implements policy{
	
	@Override
	public double CalPremium(double amount) {
		System.out.println("Your Premium amount:"+(amount+amount*0.20));
		return amount;
	}

	public static void main(String[] args) {
		
	   InsurancePolicy Ip = new InsurancePolicy();
	   Ip.CalPremium(2000);
	   Ip.RenewalReminder();
		
 
	}

	

}
