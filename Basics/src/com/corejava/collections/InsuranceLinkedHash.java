package com.corejava.collections;

import java.util.LinkedHashSet;

public class InsuranceLinkedHash {
	
	String claimId;
	String policyId;
	int price;

	public InsuranceLinkedHash(String claimId, String policyId, int price) {
		this.claimId = claimId;
		this.policyId = policyId;
		this.price = price;
	}

	public static void main(String[] args) {
		
		LinkedHashSet<InsuranceLinkedHash> insurance = new LinkedHashSet<>();
		
		insurance.add(new InsuranceLinkedHash("1","1",1000));
		insurance.add(new InsuranceLinkedHash("2", "2", 5000));
		insurance.add(new InsuranceLinkedHash("12","11",1000));
		
		
		/*for(InsuranceLinkedHash l1: insurance) {
			System.out.println("Claim ID: " + l1.claimId +
            ", Policy ID: " + l1.policyId +
            ", Price: " + l1.price);
		}*/
		
		insurance.removeIf(claim -> claim.claimId.equals("1"));
		
		for(InsuranceLinkedHash l1: insurance) {
			System.out.println("Claim ID: " + l1.claimId +
            ", Policy ID: " + l1.policyId +
            ", Price: " + l1.price);
		}
		

	}

}
