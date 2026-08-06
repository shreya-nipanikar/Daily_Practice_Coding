package com.corejava.java8featuresParttwo;


interface AccountService {
	
	public void deposit(int amount);
	public void withdraw(int amount);
	
	default void desiplayAccountDetails() {
		System.out.println("Account details are ");
	}
	
}


public class BankingDeafult implements AccountService {
	
	@Override
	public void deposit(int amount) {
		System.out.println("Deposit Amount: "+(amount+100));
		
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Deposit Amount: "+(amount-100));
		
	}

	public static void main(String[] args) {
		
		BankingDeafult BD = new BankingDeafult();
		BD.deposit(1000);
		BD.withdraw(2000);
		BD.desiplayAccountDetails();
		
		

	}

	

}
