package com.corejava.dayTwoAssignments;

import java.time.LocalDate;

public class Order {
	
	String OrderId;
	LocalDate OrderDate;
	
	public Order(String orderId, LocalDate orderDate) {
		OrderId = orderId;
		OrderDate = orderDate;
	}
	    
}

class OnlineOrder extends Order {
	
	String PaymentStatus;
	String DeliveryStatus;
	
	public OnlineOrder(String orderId, LocalDate orderDate, 
			String PaymentStatus,String DeliveryStatus) {
		super(orderId, orderDate);
		this.PaymentStatus = PaymentStatus;
		this.DeliveryStatus = DeliveryStatus;
	
	}
	
	void display() {
		System.out.println("Order Details ");
		System.out.println("Order ID : "+OrderId);
		System.out.println("Order Date :"+OrderDate);
		System.out.println("Payment Status: "+PaymentStatus);
		System.out.println("DeliveryStatus: "+DeliveryStatus);
	}
	
	
}