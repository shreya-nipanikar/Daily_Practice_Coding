package com.corejava.controlstatements;

import java.util.Scanner;

public class CartValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total amount: ");
		int amount = sc.nextInt();
		
		if(amount > 300) {
			System.out.println("Yay! Your eligible for free delivery");
		} else {
			System.out.println("Your delivery fee is: "+20);
			System.out.println("Total cost: "+(amount+20));
		}
		

	}

}
