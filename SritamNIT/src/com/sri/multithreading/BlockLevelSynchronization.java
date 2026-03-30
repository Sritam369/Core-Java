package com.sri.multithreading;

class PrintThread{
	
	public void printThreadName() {
		String name = Thread.currentThread().getName();
				
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				IO.println(name);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
			IO.println("block ended");
			
	}
}
}
public class BlockLevelSynchronization {

	public static void main(String[] args) {
		PrintThread p1 = new PrintThread();
		Thread t1 = new Thread() {
		   public void run() {	
			   p1.printThreadName();
		   }
		};
		Thread t2 = new Thread() {
			public void run() {	
				p1.printThreadName();
			}
		};
		t1.start();t2.start();
		
	}
}
