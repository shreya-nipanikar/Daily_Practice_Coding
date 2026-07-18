package com.corejava.abstractandinterface;

public interface NotificationService {
	
	void sendNotification();
	
}

class SMSNotification implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("You got a message");
		
	}
	
}

class EmailNotification implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("You got an email");
		
	}
	
}



