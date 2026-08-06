package com.corejava.java8featuresParttwo;


interface TaxDeduction {
	
	double calTotal(double incomeamount);
	
}

public class Finance {

	public static void main(String[] args) {
		
		TaxDeduction tax = (amount) -> {
			
			if(amount < 999) {
				System.out.println("Tax Rate is 10%");
				return amount - amount*0.10;
			} else if(amount >= 1000 && amount <= 9000) {
				System.out.println("Tax Rate is 30%");
				return amount - amount*0.30;
			} else {
				System.out.println("Tax Rate is 40%");
				return amount - amount*0.40;
			}
			
		};
		
		System.out.println("Total : "+tax.calTotal(500));
		System.out.println(tax.calTotal(1500));
		System.out.println(tax.calTotal(50000));
		System.out.println(tax.calTotal(75000));

	}

}
