package com.corejava.dayOneAssignments.Banking;

import java.util.Scanner;

public class Question_3_Ecommerce {
	
	public void productPrice() {
		
		//Take product name, price, quantity
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name: ");
		String prodname = sc.next();
		
		System.out.println("Enter Product Price: ");
		int prodprice = sc.nextInt();
		
		System.out.println("Enter Product Name: ");
		int prodquantity = sc.nextInt();

		
		int totalCost = prodprice * prodquantity;
		
		System.out.println("Final Amount : " +totalCost);
		
		sc.close();
		
	}
	
	//Question 8
	
	public void discountPrice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Price: ");
		int prodprice = sc.nextInt();
		
		System.out.println("Enter discount %: ");
		int discount = sc.nextInt();
		
		double discountamount = prodprice * discount/100;
		
		double finalPrice = prodprice - discountamount;
		
		System.out.println("Your Original Price : "+prodprice);
		System.out.println("Your Discount Amount : " + discountamount);
		System.out.println("Your Discounted Price : "+finalPrice);
		
	}
	
	
	

}
