package com.corejava.abstractandinterface;

public interface ClaimProcess {
	
	void processClaim();
	
}


class HealthClaim implements ClaimProcess{

	@Override
	public void processClaim() {
		System.out.println("This is health Claim Processing Unit");
		
	}
	
}

class VehicleClaim implements ClaimProcess{

	@Override
	public void processClaim() {
		System.out.println("This is Vehicle Claim Processing Unit");
		
	}
	
}
