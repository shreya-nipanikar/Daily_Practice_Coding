package com.corejava.dayTwoAssignments;

import java.util.Scanner;

public class Customer {
	
	String transactionId;
	String name;
	int contactNumber;
	
	public Customer(String transactionId, String name, int contactNumber) {
		this.transactionId = transactionId;
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
}


class CustomerPremium extends Customer {
	
	String membershipType;
	int planAmount;
	
	public CustomerPremium(String transactionId, String name, int contactNumber,
			String membershipType,int planAmount) {
		super(transactionId, name, contactNumber);
		this.membershipType = membershipType;
		this.planAmount = planAmount;
	
	}
	
	public void displayDetails(int discount) {
		double applicableDiscount = (planAmount * discount) / 100;
		System.out.println("Customer Details : ");
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Contact Details :"+contactNumber);
		System.out.println("Customer MemberShip Type :"+membershipType);
		System.out.println("Your discount "+applicableDiscount);
		
	}
	
	
}
