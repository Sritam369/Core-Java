package com.sri.multithreading;

class Test extends Thread{
	public void run() {
		IO.println("Child thread is running");
		IO.println("It's running with separate stack frame");
	}
}

public class IsAliveMethod {
  public static void main(String[] args) {
	  IO.println("Main thread started");
	  
	  Test t1 = new Test();
	  IO.println("is thread started before start(): "+t1.isAlive());
	  t1.start();
	  IO.println("is thread started after start(): "+t1.isAlive());
	  Test t2 = new Test();
	  t2.start();
	 // t1.start(); //IllegalThreadStateException
  }
}
