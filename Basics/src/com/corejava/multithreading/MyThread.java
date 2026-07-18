package com.corejava.multithreading;


class Counter {
	
	int count = 0;
	 
	synchronized void increment() {
		count++;
	}
	
}


public class MyThread extends Thread {
	
	Counter counter;
	
	public MyThread(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		for(int i=1;i <= 10; i++) {
			counter.increment();
		}
	}
	
	/*public void run() {
		
		for(int i=0; i<5; i++) {
			MainClassForExecution.count++;
		}
		
	}*/

}


