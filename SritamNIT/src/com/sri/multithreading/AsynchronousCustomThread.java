package com.sri.multithreading;

class CustomThread extends Thread {
	public void run() {
		IO.println("Child thread is running");
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
