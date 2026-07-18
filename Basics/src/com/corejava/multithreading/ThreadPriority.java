package com.corejava.multithreading;

public class ThreadPriority extends Thread {
	
	 
	public ThreadPriority(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Thread Name: " +getName());
		System.out.println("Priority : " +getPriority());
	}
	
	

}
