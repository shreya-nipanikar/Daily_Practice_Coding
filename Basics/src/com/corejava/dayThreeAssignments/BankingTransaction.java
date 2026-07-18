package com.corejava.dayThreeAssignments;

public class BankingTransaction {
	
	void transfer(int accNumber) {
		System.out.println("Account Number only : "+accNumber);
	}
	
	void transfer(int accNumber, int amount) {
		System.out.println("Account Number : "+accNumber+" and Amount "+amount);
	}
	
	void transfer(int accNumber, int amount, String transferType) {
		System.out.println("Account Number : "
				+accNumber+" Amount "
				+amount+" Transfer Type : "+transferType);
	}
	
	

}
