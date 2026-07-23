package com.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	
	String prodId;
	String prodName;
	int price;
	
	public ShoppingCart(String prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		ArrayList<ShoppingCart> shopcart = new ArrayList<>();
		
		shopcart.add(new ShoppingCart("101","MacBook",2230));
		shopcart.add(new ShoppingCart("102","Iphone",1230));
		shopcart.add(new ShoppingCart("103","MacBook",3230));
		
		ListIterator<ShoppingCart> itr = shopcart.listIterator();
		
		//Forward
		while(itr.hasNext()) {
			
			ShoppingCart cart = itr.next();
			
			if(cart.prodId.equals("101")) {
				itr.set(new ShoppingCart(cart.prodId,cart.prodName,7000));
			}
			System.out.println();
			
			if(cart.prodId.equals("103")) {
				itr.add(new ShoppingCart("104","Air",5460));
			}
			
//			System.out.println("Product Id: "+cart.prodId);
//			System.out.println("Product Name: "+cart.prodName);
//			System.out.println("Product Price: "+cart.price);
//			System.out.println("---------*****-----------");
			
			
			
		}
		
		//Backward
		while(itr.hasPrevious()) {
			
			ShoppingCart cart = itr.previous();
			System.out.println();
			
			System.out.println("Product Id: "+cart.prodId);
			System.out.println("Product Name: "+cart.prodName);
			System.out.println("Product Price: "+cart.price);
			System.out.println("---------*****-----------");
			
		}
		
		
		

	}

}
