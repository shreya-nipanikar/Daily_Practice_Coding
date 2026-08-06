package com.corejava.java8featuresParttwo;

interface OrderNotification {
	
	public void displayOrderdetails(String order);
}


public class Ecommerce {

	public static void main(String[] args) {
	
		OrderNotification Orn = (order) -> {
			System.out.println("Order Placed. Your order is: "+order);
		};
		
		Orn.displayOrderdetails("Macroni Pizza");
		Orn.displayOrderdetails("Pasta");

	}

}
