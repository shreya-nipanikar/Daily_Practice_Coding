package com.corejava.dayOneAssignments.Banking;

import java.util.Scanner;

public class Question_2_StudentMarks {
	
	public void averageCalculation() {
		
		//Take marks of 3subjects
		Scanner sc = new Scanner(System.in);
		
		//First subject
		System.out.println("Enter your maths marks : ");
		int math = sc.nextInt();
		
		//Second subject
		System.out.println("Enter your science marks : ");
		int science = sc.nextInt();
		
		//Third subject
		System.out.println("Enter your history marks : ");
		int history = sc.nextInt();
		
		int total = math+science+history;
		double average = total/3;
		
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		sc.close();
		
	}
	

}
