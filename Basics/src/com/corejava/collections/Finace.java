package com.corejava.collections;

import java.util.TreeSet;

public class Finace {

	public static void main(String[] args) {
		TreeSet<Double> interestRates = new TreeSet<>();
		
		interestRates.add(10.00);
		interestRates.add(10.10);
		interestRates.add(110.200);
		interestRates.add(120.300);
		interestRates.add(100.20);
		
		System.out.println("Interest Rates: "+interestRates);
		System.out.println("Lowest :"+interestRates.first());
		System.out.println("Highest :"+interestRates.last());
		
		System.out.println("Check if 10 is present :"
		+interestRates.contains(101.00));
		System.out.println("Remove 10 if present :"
				+interestRates.remove(10.00));
		
		System.out.println("Interest Rates: "+interestRates);

	}

}
