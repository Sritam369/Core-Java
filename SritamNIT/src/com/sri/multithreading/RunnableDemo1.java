package com.sri.multithreading;

class Tests implements Runnable{
	public void run() {
		IO.println(Thread.currentThread().getName()+" is running");
	}
}
public class RunnableDemo1 {

	void main() {
		Thread t = new Thread(new Tests());
		t.start();
	}
}
