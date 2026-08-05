package com.corejava.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainClassForExecution {

	public static void main(String[] args) {
		
		//Question 1,2,3,11,13
		
		/*
		 * List<BankingApplication> bankingapp = Arrays.asList(new
		 * BankingApplication(14000,12,2), new BankingApplication(50000,10,3),new
		 * BankingApplication(700,5,2),new BankingApplication(600,12,8));
		 * 
		 * 
		 * bankingapp.stream() .map( t -> ("Simple Interest : " +
		 * (t.getAmount()*t.getInterestRate()*t.getTime())/100)) .forEach(System.out ::
		 * println);
		 * 
		 * bankingapp.stream() .forEach( t -> { if(t.getAmount() <= 1000) {
		 * System.out.println("Low Balance : "+t.getAmount()); } else {
		 * System.out.println("Balance Maintained : "+t.getAmount()); } });
		 * bankingapp.stream() .forEach(t -> { if(t.getAmount() > 10000) {
		 * System.out.println("Total Amount : "+(t.getAmount()-50
		 * )+" ,Charge of :Rs50"); } else {
		 * System.out.println("Total Amount : "+(t.getAmount()-20
		 * )+" ,Charge of :Rs20 "); } });
		 * 
		 * 
		 * bankingapp.stream().filter(t -> t.getAmount() > 1000) .forEach(x ->
		 * System.out.println("Accounts: "+x.getAmount()));
		 * 
		 * bankingapp.stream().max(Comparator.comparingInt(BankingApplication::
		 * getAmount)) .ifPresent(x ->
		 * System.out.println("Max Amount: "+x.getAmount()));
		 */
		
		//Question 8,9,10
		/*
		 * List<Ecommerce> ecom = Arrays.asList(new Ecommerce(5000,3), new
		 * Ecommerce(6000,2),new Ecommerce(100,5) );
		 * 
		 * ecom.stream() .forEach(discount -> { if(discount.getProd_price() > 5000) {
		 * System.out.println("Calculated discount : " +discount.getProd_price()*0.10);
		 * } else { System.out.println("Calculated discount : "
		 * +discount.getProd_price()*0.05); } }); ecom.stream() .forEach(t -> {
		 * 
		 * if(t.getProd_price() > 999) { System.out.println("Free Delivery"); } else {
		 * System.out.println("Sorry, no free delivery"); }
		 * 
		 * }); ecom.stream() .forEach(t -> { if(t.getRating() >= 4) {
		 * System.out.println("Recommended Product"); } else {
		 * System.out.println("Average Product"); } });
		 */
		
		//Question 18,19,20
		
		List<EcommerceStream> ecom = Arrays.asList(new EcommerceStream(50000,3), new
				  EcommerceStream(6000,2),new EcommerceStream(100,0) );
		
		//Expensive Products
		ecom.stream()
					.filter(t -> t.getProductPrice()> 10000)
					.forEach(x -> System.out.println("Price : "+x.getProductPrice()));
		//Sort Product Prices
		ecom.stream()
		  			.sorted(Comparator.comparing(EcommerceStream::getProductPrice))
		  			.forEach(System.out::println);
		//Out of stock products
		 long count = ecom.stream()
					.filter(t -> t.getStockQuantity() == 0).count();
		 System.out.println("Zero value stocks are : "+count);
					
		
	}

}
