package com.corejava.stringwrapper;

import java.util.Scanner;

public class Finace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter transaction amount");
		String input1 = sc.next();
		System.out.println("Enter transaction amount");
		String input2 = sc.next();
		
		//Convert it to double using wrapper class
		Double inputt1 = Double.valueOf(input1);
		Double inputt2 = Double.valueOf(input2);
		
		//Addition & Subtraction
		System.out.println("Additon :"+(inputt1+inputt2));
		System.out.println("Subtraction :"+(inputt1-inputt2));
		
		//Compare amounts
		System.out.println("The value of comparaion: "+Double.compare(inputt1, inputt2));
		
		//Covert the value back to string
		String s = Double.toString(inputt1);
		String s1 = Double.toString(inputt2);
		
		System.out.println("String values: "+s+ " " +s1);
		

	}

}
