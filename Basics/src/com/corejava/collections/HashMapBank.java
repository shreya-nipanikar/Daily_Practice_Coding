package com.corejava.collections;

import java.util.HashMap;

public class HashMapBank {
	
	String Holdername;
	int balance;
	String branch;  

	public HashMapBank(String holdername, int balance, String branch) {
		this.Holdername = holdername;
		this.balance = balance;
		this.branch = branch;
	}

	public static void main(String[] args) {
		
		HashMap<Integer,HashMapBank> accounts = new HashMap<>();
		
		accounts.put(1, new HashMapBank("Shreya",1000,"SBI"));
		accounts.put(2, new HashMapBank("Rahul",2000,"HSBC"));
		accounts.put(3, new HashMapBank("Shree",3000,"SBI"));
		accounts.put(4, new HashMapBank("Rahull",2400,"HSBC"));
		accounts.put(5, new HashMapBank("Rohit",1200,"SBI"));
		
		int accountnumber = 2;
		HashMapBank account = accounts.get(accountnumber);
		System.out.println("Details: "+account.Holdername+" "+account.branch);
        
		account.balance += 500;
		System.out.println("Updated Balance: "+account.balance);
		
		accounts.remove(5);
		
         for(Integer accountnumb: accounts.keySet()) {
			
			HashMapBank accountt = accounts.get(accountnumb);
			System.out.println("Account Number: "+accountnumb);
			System.out.println("Account HolderName: "+accountt.Holdername);
			System.out.println("Account balance: "+accountt.balance);
			System.out.println("Account Branch:"+accountt.branch);	
			System.out.println();
			
		}
		
	}

}
