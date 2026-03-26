package com.sri.multithreading;

class Alpha extends Thread{
	public void run() {
		Thread t  = Thread.currentThread();
		String name = t.getName();
		
		Beta b1 = new Beta();
		b1.setName("beta");
		b1.start();
		try {
			b1.join();
			IO.println("Alpha thread re-started");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			IO.println(i);
		}
	}
}

class Beta extends Thread{
	public void run() {
		Thread t  = Thread.currentThread();
		String name = t.getName();
		
		for(int i=1;i<=5;i++) {
			IO.println(i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		IO.println("Beta thread ended");
	}
}

public class JoinMethodDemo2 {
    void main() {
	 Alpha a = new Alpha();
	 a.setName("alpha");
	 a.start();
 }
}
