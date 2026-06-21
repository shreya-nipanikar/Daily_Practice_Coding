package com.corejava.dayOneAssignments.Banking;

import java.util.Scanner;

public class Question_5_Insurance {
	
	static int ServiceCharge = 200;
	
	public void PremiumCalculation() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your Premium amount : ");
		int amount = sc.nextInt();
		
		int totalAmount = amount + ServiceCharge;
		
		System.out.println("Your Total Premium Amount : "+totalAmount);
		
		sc.close();
	}
	
	public void PolicyDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your policy number : ");
		int number = sc.nextInt();
		
		System.out.println("Please enter your policy name : ");
		String name = sc.next();
		
		System.out.println("Please enter your policy amount : ");
		int amount = sc.nextInt();
		
		
		
		System.out.println("Your name : "+name);
		System.out.println("Your Policy Number : "+number);
		System.out.println("Your Policy Amount : "+amount);
		
		sc.close();
	}
	
	

}
