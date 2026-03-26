package com.sri.multithreading;

class CustomThread2 extends Thread {
	public void run() {
		IO.println("Child thread is running");
		IO.println(Thread.currentThread().getName());
	}
}
public class SynchronousCustomThread {
	public static void main(String[] args) {
		IO.println("Main thread started");
		IO.println(Thread.currentThread().getName());
		CustomThread2 ct = new CustomThread2();
		ct.run();
		IO.println("Main thread ended");
	}
}
