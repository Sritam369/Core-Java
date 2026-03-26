package com.sri.multithreading;

public class AnonymousWithoutRef {

	void main() {
		new Thread() {
			public void run() {
				IO.println(Thread.currentThread().getName()+" is running");
			}
		}.start();
	}
}
