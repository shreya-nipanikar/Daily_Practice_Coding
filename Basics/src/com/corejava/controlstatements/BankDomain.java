package com.corejava.controlstatements;

import java.util.Scanner;

public class BankDomain {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Account Balance");
	int acc = sc.nextInt();
	int min = 1000;
	
	if(acc < min) {
		System.out.println("Your below minimum balance requirement");
		return;
	}
	
	System.out.println("Enter withdrawal amount");
	int withdraw = sc.nextInt();
	
	
	if(withdraw >= acc) {
		System.out.println("Insufficient balance");
	} else {
		System.out.println("Your current balance: "+(acc-withdraw));
		
	}	}
		

}
