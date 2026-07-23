package com.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorBank {
	
	String accName;
	int balance;
    
	public IteratorBank(String accName, int balance) {
		this.accName = accName;
		this.balance = balance;
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<IteratorBank> accDetails = new ArrayList<>();
		
		accDetails.add(new IteratorBank("SBI",1239));
		accDetails.add(new IteratorBank("HSBC",2239));
		accDetails.add(new IteratorBank("HDFC",3209));
		accDetails.add(new IteratorBank("SBI",5239));
		
		Iterator<IteratorBank> it = accDetails.iterator();
		
		while(it.hasNext()) {
			IteratorBank bank = it.next();
			
			System.out.println(bank.accName);
			System.out.println(bank.balance);
			
			if(bank.balance < 3000) {
				it.remove();
			}
			
		}
		
		System.out.println("Remaining Accounts: ");
		
		Iterator<IteratorBank> itr = accDetails.iterator();
		
		while(itr.hasNext()) {
			IteratorBank bb = itr.next();
			
			System.out.println("Bank AccName: "+bb.accName);
			System.out.println("Balance :"+bb.balance);
		}
		

	}

}
