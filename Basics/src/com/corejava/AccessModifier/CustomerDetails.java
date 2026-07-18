package com.corejava.AccessModifier;

public class CustomerDetails {
	
	private int customerId;
	private String customerName;
	
	public void details(int id,String name) {
		this.customerId = id;
		this.customerName = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	

}
