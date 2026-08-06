package com.corejava.java8featuresParttwo;

interface ValidTransaction {

	boolean isValid(int amount, int dailyLimit);
		
}

public class BankingTransaction {

	public static void main(String[] args) {
		
		ValidTransaction transac = 
				(amount, dailyLimit) -> amount > 0 && amount <= dailyLimit;
		
			System.out.println(transac.isValid(5000, 1000));
			
	}
	
}
