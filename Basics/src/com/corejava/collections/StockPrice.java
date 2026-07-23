package com.corejava.collections;

import java.util.TreeMap;

public class StockPrice {
	
	String companyName;
	int price;
	
	public StockPrice(String companyName, int price) {
		super();
		this.companyName = companyName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "StockPrice [companyName=" + companyName + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		TreeMap<Integer,StockPrice> stockPrice = new TreeMap<>();
		
		stockPrice.put(103, new StockPrice("ABC",42000));
		stockPrice.put(101, new StockPrice("XYZ",12000));
		stockPrice.put(104, new StockPrice("ARD",32000));
		
		for(Integer id: stockPrice.keySet()) {
			System.out.println("Id: "+id);
			System.out.println(stockPrice.get(id));
			
		}
		
		System.out.println("First Entry: "+stockPrice.firstEntry());		
		System.out.println("Last Entry: "+stockPrice.lastEntry());
		
		int idd = 103;
		StockPrice priceupdate = stockPrice.get(idd);
		priceupdate.price += 20203;
		System.out.println("Upadted Price: "+priceupdate);
		System.out.println("Removed :"+stockPrice.remove(idd));
	}

}
