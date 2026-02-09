package com.sri.multithreading;

class DoStuff extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		IO.println("Running thread name is: "+name);
	}
}

public class SetNameMethod {

	public static void main(String[] args) {
		Thread.currentThread().setName("parent");
		String name = Thread.currentThread().getName();
		IO.println("Running thread name is: "+name);
		
		DoStuff d1 = new DoStuff();
		d1.setName("child1");
		d1.start();
		
		DoStuff d2 = new DoStuff();
		d2.setName("child2");
		d2.start();
	}

}
