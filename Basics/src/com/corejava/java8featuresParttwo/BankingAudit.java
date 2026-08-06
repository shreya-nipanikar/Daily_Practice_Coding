package com.corejava.java8featuresParttwo;

public class BankingAudit {

	public static void main(String[] args) {
	
		
		Runnable auditTask = () -> {
			  System.out.println("Transaction Completed");
	          System.out.println("Updating Audit Logs...");
	          System.out.println("Audit Updated Successfully");
		};
		
		Thread t = new Thread(auditTask);
		t.start();
			

	}

}
