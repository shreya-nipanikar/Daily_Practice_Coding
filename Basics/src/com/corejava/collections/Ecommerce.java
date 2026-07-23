package com.corejava.collections;

import java.util.LinkedHashMap;

public class Ecommerce {
	
	String Name;
	String ProdName;
	int amount;
	
	public Ecommerce(String name, String prodName, int amount) {
	
		Name = name;
		ProdName = prodName;
		this.amount = amount;
	}
    
	@Override
	public String toString() {
		return "Ecommerce [Name=" + Name + ", ProdName=" + ProdName + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {
		LinkedHashMap<Integer,Ecommerce> ecom = new LinkedHashMap<>();
		
		//Add values
		ecom.put(1, new Ecommerce("Joshi","IPhone",1200));
		ecom.put(2, new Ecommerce("John","IPhone",1000));
		ecom.put(3, new Ecommerce("Riya","IPhone",200));
		ecom.put(4, new Ecommerce("Amit","Laptop",4200));
		
		int total=0;
		
		for(Integer id: ecom.keySet()) {
			System.out.println("Id: "+id);
			System.out.println(ecom.get(id));
			
			Ecommerce value = ecom.get(id);
			total +=value.amount;
			
			
		}
		System.out.println("Total Amount: "+total);
		ecom.remove(3);
		
		

	}

}
