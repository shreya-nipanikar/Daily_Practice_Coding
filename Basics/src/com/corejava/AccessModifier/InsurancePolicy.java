package com.corejava.AccessModifier;

public class InsurancePolicy {
	
	
	private String policyNumber;
	private String policyName;
	protected String inuranceCompany;
	
	public void display(String policyno, String policyname,String insurance) {
		
		this.policyNumber = policyno;
		this.policyName = policyname;
		this.inuranceCompany = insurance;
		
		 System.out.println("Policy Number: " + policyNumber);
		  System.out.println("Policy Name: " + policyName);
		
		
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getInuranceCompany() {
		return inuranceCompany;
	}

	public void setInuranceCompany(String inuranceCompany) {
		this.inuranceCompany = inuranceCompany;
	}
		
}


