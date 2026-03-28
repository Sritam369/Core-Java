package com.sri.multithreading;

public class AnonymousRunnableWithThreadConstructor {

	void main() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {	
				IO.println(Thread.currentThread().getName()+" is running");
			}
		});
		t1.start();
	}
}
