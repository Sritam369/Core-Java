package com.sri.multithreading;

class CustomThread2 extends Thread {
	public void run() {
		IO.println("Child thread is running");
	}
}
public class SynchronousCustomThread {
	public static void main(String[] args) {
		IO.println("Main thread started");
		CustomThread2 ct = new CustomThread2();
		ct.run();
		IO.println("Main thread ended");
	}
}
