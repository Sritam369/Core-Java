package com.sri.multithreading;

class Foo extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		IO.println(name+" thread is running");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		IO.println(name+" thread is running");
		
		Foo f1 = new Foo();
		f1.start();
		
		Foo f2 = new Foo();
		f2.start();
		
		IO.println(10/0);
		IO.println(name+" thread completed");
	}

}
