package com.corejava.exceptionhandling;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ReservationTravel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter travel date (yyyy-mm-dd): ");
			LocalDate travelDate = LocalDate.parse(sc.next());
			
			if(travelDate.isBefore(LocalDate.now())) {
				throw new Exception("Travel date cannot be in past");
			}
			
			System.out.println("Travel date booked successfully: " + travelDate);
			
		} catch(DateTimeParseException e) {
			System.out.println("Invalid date format. Please enter in yyyy-mm-dd");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
