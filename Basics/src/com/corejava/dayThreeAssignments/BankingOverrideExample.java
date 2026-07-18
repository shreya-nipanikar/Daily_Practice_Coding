package com.corejava.dayThreeAssignments;

public class BankingOverrideExample {
	
	void savingsAcc() {
		System.out.println("This is Shreya's Acc!");
	}

}

class CurrentAcc extends BankingOverrideExample {
	
	@Override
	void savingsAcc() {
		System.out.println("This is my child acc!");
	}
	
}
