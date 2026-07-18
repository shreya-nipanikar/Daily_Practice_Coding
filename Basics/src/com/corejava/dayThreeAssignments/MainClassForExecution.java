package com.corejava.dayThreeAssignments;

public class MainClassForExecution {

	public static void main(String[] args) {
		
		/*Quest 1
		BankAcc ba = new BankAcc();
		ba.CalculateBalance(1000);
		ba.CalculateBalance(1000, 2000);
		ba.CalculateBalance(5000, 2000, 10);*/
		
		/*Quest 2
		Insurance inc = new Insurance();
		inc.CalcPremium(25);
		inc.CalcPremium(28, "Health");
		inc.CalcPremium(24, "Health", 290);*/
		
		/*Quest 3
		LoanProcessing lp = new LoanProcessing();
		lp.CalcEMI(1000);
		lp.CalcEMI(1000,12);
		lp.CalcEMI(1000, 12, 10);*/
		
		/*Quest 4
		Ecommerce ec = new Ecommerce();
		ec.CalculateProdPrice(1000);
		ec.CalulateProdPrice(2000, 10);
		ec.CalculateProdPrice(5000, 10, 200);*/
		
		/*Quest 5
		BankingTransaction bt = new BankingTransaction();
		bt.transfer(123);
		bt.transfer(234, 1000);
		bt.transfer(342,1020,"Checkings");*/
		
		/*Quest 1 Method Override
		BankingOverrideExample acc1 = new BankingOverrideExample();
		BankingOverrideExample acc2 = new CurrentAcc();
		acc1.savingsAcc();
		acc2.savingsAcc();*/
		
		InsuranceMethodOverideExample inc1 = new InsuranceMethodOverideExample();
		InsuranceMethodOverideExample inc2 = new healthInsurance();
		InsuranceMethodOverideExample inc3 = new vehicleInsurance();
		inc1.policyDetails();
		inc2.policyDetails();
		inc3.policyDetails();
		

	}

}
