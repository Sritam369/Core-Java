package com.sri.multithreading;

class CustomThread extends Thread {
	public void run() {
		IO.println("Child thread is running");
		IO.println("child thread is: "+Thread.currentThread().getName());
	}
}

public class AsynchronousCustomThread {

	public static void main(String[] args) {
		IO.println("Main thread started");
		CustomThread ct = new CustomThread();
		ct.start();
		IO.println("Main thread ended");
	}

}
