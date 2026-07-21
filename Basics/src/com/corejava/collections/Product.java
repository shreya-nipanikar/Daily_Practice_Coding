package com.corejava.collections;

import java.util.ArrayList;

public class Product {
	
	String ProductId;
	String name;
	int price;
	
	public Product(String productId, String name, int price) {
		super();
		ProductId = productId;
		this.name = name;
		this.price = price;
	}



	public static void main(String[] args) {
		
		ArrayList<Product> prod = new ArrayList<>();
		
		prod.add(new Product("1","Electronic",1000));
		prod.add(new Product("2","Iphone",2000));
		prod.add(new Product("3","Meds",3000));
		prod.add(new Product("4","Medical",4000));
		
		for(Product p1: prod) {
			System.out.println(p1.name+" "+p1.ProductId+" "+p1.price);
		}

	}

}
