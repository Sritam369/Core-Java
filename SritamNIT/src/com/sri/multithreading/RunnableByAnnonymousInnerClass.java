package com.sri.multithreading;

public class RunnableByAnnonymousInnerClass {

	void main() {
		Runnable r1 = new Runnable() {
			public void run() {
				IO.println(Thread.currentThread().getName()+" is running");
			}
		};
		Thread t = new Thread(r1);
		t.start();
	}
}
