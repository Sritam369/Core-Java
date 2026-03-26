package com.sri.multithreading;

public class JoinMethodDeadlock {

	void main() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=1;i<=5;i++) {
			IO.println("i = "+i);
			try {
				t.join(); // main thread is waiting for main thread [deadlock]
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
