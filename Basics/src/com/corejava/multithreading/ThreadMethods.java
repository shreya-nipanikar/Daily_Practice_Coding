package com.corejava.multithreading;

public class ThreadMethods extends Thread {
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("Numbers : "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
