package com.corejava.dayTwoAssignments;

public class LoanProcess {
	
	String loadId;
	int amount;
	int loanTenure;
	
	public LoanProcess(String loadId, int amount, int loanTenure) {
		this.loadId = loadId;
		this.amount = amount;
		this.loanTenure = loanTenure;
	}
	
	
}

class HomeLoan extends LoanProcess {
	
	int interestRate;
	

	public HomeLoan(String loadId, int amount, int loanTenure, int interestRate) {
		super(loadId, amount, loanTenure);
		this.interestRate = interestRate;
		
	}
	
	void totalPayment() {
		double interest = (amount * interestRate * loanTenure)/100;
		double TotalPay = amount + interest;
		System.out.println("Your Interest is : "+interest);
		System.out.println("Your Total Payment "+TotalPay);
	}
	
	
	
}
