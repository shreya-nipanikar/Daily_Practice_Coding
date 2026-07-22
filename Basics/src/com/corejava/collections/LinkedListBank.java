package com.corejava.collections;

import java.util.LinkedList;

public class LinkedListBank {
	
	String transactionId;
	String accnumb;
	String transactionType;
	int price;
	
	public LinkedListBank(String transactionId, String accnumb, String transactionType, int price) {
		
		this.transactionId = transactionId;
		this.accnumb = accnumb;
		this.transactionType = transactionType;
		this.price = price;
	}


	public static void main(String[] args) {
		
		LinkedList<LinkedListBank> bank = new LinkedList<>();
		
		bank.add(new LinkedListBank("1","1234","Credit",1000));
		bank.add(new LinkedListBank("2","1234","Debit",2000));
		bank.add(new LinkedListBank("3","2345","Credit",2503));
		bank.add(new LinkedListBank("4","3423","Credit",2321));
		bank.addFirst(new LinkedListBank("5","2324","Debit",2345));
		bank.addLast(new LinkedListBank("6", "2326","Credit", 5000));
		bank.removeFirst();
		
		for(LinkedListBank l1: bank) {
			System.out.println(l1.transactionId+" "+l1.accnumb+" "+l1.transactionType+" "+l1.price);
		}

	}

}
