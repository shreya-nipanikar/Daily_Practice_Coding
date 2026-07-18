package com.corejava.AccessModifier;

public class MainClassForExecution {
	
	public static void main(String[] args) {
		
		
		/*BankAccount acc = new BankAccount();
		acc.setAccountDeatils(122, 100);
		
		System.out.println("Account Number : " +acc.getAccountNumber());
		System.out.println("Account balance : " +acc.getBalance());*/
		
		
		/*HealthPolicy inspolicy = new HealthPolicy();
		inspolicy.display("123", "Medical", "Medicare");
		
		inspolicy.displayDetails();*/
		
		CustomerDetails cd = new CustomerDetails();
		cd.details(12, "Arya");
		
		System.out.println("Id: "+cd.getCustomerId());
		System.out.println("Name: "+cd.getCustomerName());
		
		
	}	

}
