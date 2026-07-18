package com.corejava.constructor;

public class MultipleAcc {
	
	//Constructor Overloading
	public MultipleAcc(String accType) {
		System.out.println("Account Type : "+accType);
	}
	
	public MultipleAcc(String accType,int balance) {
		System.out.println("Account Type : "+accType);
		System.out.println("Balance : "+balance);
	}
	
	

}
