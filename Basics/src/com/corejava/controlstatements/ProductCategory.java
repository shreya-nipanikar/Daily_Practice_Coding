package com.corejava.controlstatements;

import java.util.Scanner;

public class ProductCategory {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose menu \n 1. Electronics \n 2. Clothing \n 3.Grocery");
		
		int product = sc.nextInt();
		
		switch(product) {
		case 1: 
			System.out.println("Your offer is 70% discount in elctronics");
			break;
		case 2:
			System.out.println("Your offer is 30% in clothing");
			break;
		case 3: 
			System.out.println("Your offer is 10% in grocery");
			break;
		default:
			System.out.println("Invalid Operation");
			break;
			
		
		}
		sc.close();
		
		
	}

}
