package com.corejava.controlstatements;

import java.util.Scanner;

public class loginAttempts {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int piin=5577;
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter your pin :");
			int pin = sc.nextInt();
		
			if(pin==piin) {
				System.out.println("Access allowed");
				return;
			} else {
				System.out.println("You entered wrong pin. Try again");
			}	
		}	}

}
