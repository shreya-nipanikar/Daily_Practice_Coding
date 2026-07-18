package com.corejava.multithreading;

public class MainClassForExecution {
	
	//static int count = 0;

	public static void main(String[] args) throws InterruptedException {
		
		
		/*MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		
		t1.join();
        t2.join();

        System.out.println("Count = " + count);
		//t.start();
		//t.yield();
		//t.run();
		
		//for(int i=0;i<=10;i++) {
		//	System.out.println("Main Thread");}
		
	/*ThreadRunnable t = new ThreadRunnable();
	//Thread t1 = new Thread(t);
	t1.start();
	
		
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thread");
		}*/
		
		
	/*	ThreadPriority t1 = new ThreadPriority("Thread-1");
		ThreadPriority t2 = new ThreadPriority("Thread-2");
		ThreadPriority t3 = new ThreadPriority("Thread-3");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		*/
		
		//ThreadMethods t = new ThreadMethods();
		//t.start();
		
		Counter counter = new Counter();
		
		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);
		
		System.out.println("Before start(): " + t1.getState());

		
		t1.start();
		t2.start();
		System.out.println("After start(): " + t1.getState());
		
		t1.join();
		t2.join();
		
		System.out.println("Final count = " +counter.count);
		System.out.println("After completion: " + t1.getState());
		

	}

}
