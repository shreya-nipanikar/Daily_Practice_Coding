package com.corejava.exceptionhandling;

public class Reservation extends Exception{

	public Reservation(String message) {
		super(message);
	}

}


class SeatNotAvailable {
	
	int seats=5;
	
	public void CheckAvailablity(int req) throws Reservation{
		
		if(req > seats) {
			throw new Reservation("Seats not available");
		}
		
		System.out.println("Reserved Successfully");
		
		
	}
	
}
