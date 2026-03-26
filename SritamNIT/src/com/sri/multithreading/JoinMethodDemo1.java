package com.sri.multithreading;

class Join extends Thread {
	public void run() {
		IO.println(Thread.currentThread().getName()+" thread started");
		for(int i=1;i<=5;i++) {
			IO.println(i);
		}
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		IO.println(Thread.currentThread().getName()+" thread completed");
	}
}

public class JoinMethodDemo1  {

	void main() throws InterruptedException {
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.start();
		j1.join();
		IO.println("main thread wake up");
		j2.start();
		j3.start();
		IO.println("main thread ended");
	}
}
