package com.corejava.abstractandinterface;

public class Mainclassforexecution {
	
	public static void main(String[] args) {
		
		/*
		 * HealthInsurance IH = new HealthInsurance(1,"Raj"); IH.calculatePremium();
		 * 
		 * VehicleInsurance VI = new VehicleInsurance(2,"Patil"); VI.calculatePremium();
		 */
		
		/*
		 * CardPayment cp = new CardPayment(); cp.makePayment(1000);
		 * 
		 * UPIPayment vp = new UPIPayment(); vp.makePayment(2000);
		 */
		
		
		/*
		 * HealthClaim hc = new HealthClaim(); hc.processClaim();
		 * 
		 * VehicleClaim vc = new VehicleClaim(); vc.processClaim();
		 */
		
		
		/*
		 * CreditCardPayment cp = new CreditCardPayment(); cp.pay(2000);
		 * 
		 * NetBankingPayment np = new NetBankingPayment(); np.pay(1000);
		 * 
		 */	
		
		
		SMSNotification sm = new SMSNotification();
		sm.sendNotification();
		
		EmailNotification em = new EmailNotification();
		em.sendNotification();
	
	}

}
