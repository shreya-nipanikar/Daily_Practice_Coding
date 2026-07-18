package com.corejava.exceptionhandling;

import java.util.Scanner;

public class BankAccNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter acc no");
		String acc = sc.next();
		
		try {
			
			if(acc.length() != 12) {
				throw new Exception("Your acc number should be 12 digits");
			}
			
			System.out.println("Perfect :"+acc);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
