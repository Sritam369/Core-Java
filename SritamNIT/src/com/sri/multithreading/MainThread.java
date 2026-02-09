package com.sri.multithreading;

public class MainThread {

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		IO.println("CURRENT THREAD IS: "+currentThread);
		IO.println("Running thread name is: "+currentThread.getName());

	}

}
