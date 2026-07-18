package com.corejava.constructor;

public class Product {
	
	String productId;
	String name;
	int price;
	
	public Product(String productId, String name, int price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price);
		
	}
	
	
	

}
