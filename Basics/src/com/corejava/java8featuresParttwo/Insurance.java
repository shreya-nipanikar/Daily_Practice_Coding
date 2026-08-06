package com.corejava.java8featuresParttwo;

interface PremiumCal{
	
	double Calculate(int amount, String insuranceType);
	
}


public class Insurance {

	public static void main(String[] args) {
		
   
		PremiumCal cal = (amount,type) -> {
			
			if(type.equals("health")) {
				return amount + (amount * 0.20);
			} else if(type.equals("Life"))
			{
				return amount + (amount*0.15);
			} else {
				return amount + amount*0.10;
			}
		};
		
		System.out.println(cal.Calculate(100, "health"));
		System.out.println(cal.Calculate(1000, "Life"));
		System.out.println(cal.Calculate(6000, "health"));
		System.out.println(cal.Calculate(7000, "Vehicle"));
		
	}

}
