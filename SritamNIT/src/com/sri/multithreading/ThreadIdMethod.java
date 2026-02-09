package com.sri.multithreading;

class MyThread extends Thread{
	public void run() {
		IO.println("child thread is running");
		Thread t = Thread.currentThread();
		IO.println("Id of child thread is :"+t.threadId());
	}
}

public class ThreadIdMethod {

	public static void main(String[] args) {
		IO.println("Main thread is started");
		Thread t = Thread.currentThread();
		IO.println("Id of main thread is : "+t.threadId());
		
		MyThread mt = new MyThread();
		mt.start();
		try {
			mt.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		IO.println("Main thread ended");
	}

}
