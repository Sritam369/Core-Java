package com.sri.multithreading;

class Demo implements Runnable{
	
int data = 0;

	@Override
	public void run() {
		
		synchronized(this) {
			
			IO.println("Child thread got the lock");
			
			for(int i=1;i<=1000;i++) {
				data+=i;
			}
			IO.println("sending notification to the main thread");
			notify();
		}
	}
	
}
public class ITCDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
	   Demo d1 = new Demo();
	   Thread t1 = new Thread(d1);
	   t1.start();
	   
	   synchronized(d1) {
		   IO.println("Main thread is going to wait, after releasing the lock");
		   d1.wait();
		   IO.println("main thread got notification");
		   IO.println(d1.data);
	   }
	}

}
