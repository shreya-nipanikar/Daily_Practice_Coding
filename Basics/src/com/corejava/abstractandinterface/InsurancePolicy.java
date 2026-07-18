package com.corejava.abstractandinterface;

public abstract class InsurancePolicy {
	
	int policyId;
	String policyHolder;
	
	public InsurancePolicy(int policyId, String policyHolder) {
		super();
		this.policyId = policyId;
		this.policyHolder = policyHolder;
	}
	
	
	abstract void calculatePremium();
	

}

class HealthInsurance extends InsurancePolicy{

	public HealthInsurance(int policyId, String policyHolder) {
		super(policyId, policyHolder);
		
	}

	@Override
	void calculatePremium() {
		System.out.println("Health Insurance Premium");
		
	}
	
}

class VehicleInsurance extends InsurancePolicy {

	public VehicleInsurance(int policyId, String policyHolder) {
		super(policyId, policyHolder);
		
	}

	@Override
	void calculatePremium() {
		System.out.println("Vehicle Insurance Premium");
		
	}
	
}
