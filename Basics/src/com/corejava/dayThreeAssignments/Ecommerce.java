package com.corejava.dayThreeAssignments;

public class Ecommerce {
	
	void CalculateProdPrice(int basePrice) 
	{
		System.out.println("Base Price : "+basePrice);
	}
	
	void CalulateProdPrice(int basePrice, int discount) {
		int discountAmount = (basePrice * discount)/100;
		int totalAmount = basePrice - discountAmount;
		System.out.println("Discount Price : "+discountAmount);
		System.out.println("Total Amount : "+totalAmount);
	}
	
	void CalculateProdPrice(int basePrice, int discount, int tax) {
	
		int discountAmount = (basePrice * discount)/100;
		int totalAmount = basePrice - discountAmount + tax;
		
		System.out.println("Discount Price : "+discountAmount);
		System.out.println("Total Amount  with tax: "+totalAmount);
		
	}

}
