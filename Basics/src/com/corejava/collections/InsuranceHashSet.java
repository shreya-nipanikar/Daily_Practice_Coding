package com.corejava.collections;

import java.util.HashSet;

public class InsuranceHashSet {

	public static void main(String[] args) {
		
		
		HashSet<Integer> policynumbers = new HashSet<>();
		
		policynumbers.add(1);
		policynumbers.add(2);
		policynumbers.add(13);
		policynumbers.add(29);
		policynumbers.add(10);
		policynumbers.add(21);
		
		
		System.out.println("HashSet : "+policynumbers);
		
		//policy number exists
		System.out.println("Policy number 13 exists: "+policynumbers.contains(13));
		System.out.println("Remove policy number 29: "+policynumbers.remove(29));
		System.out.println("HashSet : "+policynumbers);

	}

}
