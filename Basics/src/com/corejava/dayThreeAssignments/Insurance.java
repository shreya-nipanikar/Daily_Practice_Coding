package com.corejava.dayThreeAssignments;

public class Insurance {
	
	void CalcPremium(int age) {
		int cost = age * 100;
		System.out.println("Your premium cost : "+cost);
	}
	
	void CalcPremium(int age, String policyType) {
		int cost = age * 100;
		System.out.println("Your premium cost : "
		       +cost+" Policy Type : "+policyType);
		}
		
	void CalcPremium(int age, String policyType,int covamount) {
			int cost = age * 100;
			int covAmount = cost + 500;
			System.out.println("Your premium cost : "
			       +cost+" Policy Type : "+policyType+
			       " Coverage Amount : "+covAmount
					);
	}

}
