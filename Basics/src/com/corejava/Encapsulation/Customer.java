package com.corejava.Encapsulation;

public class Customer {
	
	private String customerId;
	private String name;
	private String email;
	private int walletBalance;
	
	public Customer(String customerId, String name, String email, int walletBalance) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.walletBalance = walletBalance;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(int walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public void Recharge(int rechargeAmount) {
		int recharge = walletBalance + rechargeAmount;
		System.out.println("Your recharge plan :"+recharge);
	}
	

}
