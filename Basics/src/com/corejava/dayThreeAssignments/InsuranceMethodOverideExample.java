package com.corejava.dayThreeAssignments;

public class InsuranceMethodOverideExample {

	void policyDetails() {
		System.out.println("Policy details: 76872");
	}
	
}

class healthInsurance extends InsuranceMethodOverideExample{
	
	@Override
	void policyDetails() {
		System.out.println("Health Policy Details: 12345");
	}
	
}

class vehicleInsurance extends InsuranceMethodOverideExample{
	
	@Override
	void policyDetails() {
		System.out.println("Vehicle Policy Deatils : 56565");
	}
}