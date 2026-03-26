package com.sri.multithreading;

public class AnonymousWithRef {

	void main() {
	Thread t1 = new Thread() {
		public void run() {
			String name = Thread.currentThread().getName();
			IO.println(name+" is running");
		}
	};
	t1.start();
	}
}
