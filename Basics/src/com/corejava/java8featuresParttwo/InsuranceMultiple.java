package com.corejava.java8featuresParttwo;


interface insuranceRules{
	
	default void rule() {
		System.out.println("This is insurance rule");
	}
	
}

interface complianceRules{
	
	default void rule() {
		System.out.println("This is compliance rule");
	}
	
}


public class InsuranceMultiple implements insuranceRules, complianceRules{
	@Override
	public void rule() {
		insuranceRules.super.rule();
		complianceRules.super.rule();
		
	}

	public static void main(String[] args) {
		
         InsuranceMultiple IM = new InsuranceMultiple();
         
         IM.rule();
         
	}

}
