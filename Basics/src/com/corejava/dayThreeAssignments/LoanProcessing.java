package com.corejava.dayThreeAssignments;

public class LoanProcessing {
	
	void CalcEMI(int loanAmount) {
		System.out.println("Loan Amount : "+loanAmount);
	}
	
	void CalcEMI(int loanAmount,int interestRate) {
		double interest = (loanAmount * interestRate) / 100;
		double amount = loanAmount + interest;
		System.out.println("Interest: "+interest);
		System.out.println("Loan Amount with interest : "+amount);
		
	}
	
	void CalcEMI(int loanAmount,int interestRate,int tenure) {
		double interest = (loanAmount * interestRate * tenure) / 100;
		double amount = loanAmount + interest;
		System.out.println("Interest: "+interest);
		System.out.println("Loan Amount with tenure : "+amount);
		
	}
	

}
