package com.corejava.exceptionhandling;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance: ");
		int amount = sc.nextInt();
		
		System.out.println("Enter withdrawal");
		int withdraw = sc.nextInt();
		
		try {
			if(withdraw>amount) {
				throw new Exception("Insufficient balance");
			}
			
			amount -= withdraw;
			System.out.println("Remaining balance: "+amount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
