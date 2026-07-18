package com.corejava.Encapsulation;

public class Policy {
	
	private String policyId;
	private String policyHolderName;
	private int premiumAmount;
	private String policyStatus;
	
	public Policy(String policyId, String policyHolderName, int premiumAmount, String policyStatus) {
		super();
		this.policyId = policyId;
		this.policyHolderName = policyHolderName;
		this.premiumAmount = premiumAmount;
		this.policyStatus = policyStatus;
	}

	public String getPolicyId() {
		return policyId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public int getPremiumAmount() {
		return premiumAmount;
	}


	public String getPolicyStatus() {
		return policyStatus;
	}

	
	public void updatePremium(int premium) {
		premiumAmount = premium;
		System.out.println("New Permium : "+premium);
	   
	}
	
	public void policyStatus(String newPS) {
		policyStatus = newPS;
		System.out.println("New Status : "+newPS);
	   
	}
	

}
