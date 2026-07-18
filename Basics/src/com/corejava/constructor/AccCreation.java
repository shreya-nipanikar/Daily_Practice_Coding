package com.corejava.constructor;

public class AccCreation {
	
	int balance;
	String AccType;
	
	AccCreation(){
		balance = 1000;
		AccType = "Checkings";
	}
	
	void displayDetails() {
        System.out.println("Account Type: " + AccType);
        System.out.println("Balance: " + balance);
    }
	
	

}
