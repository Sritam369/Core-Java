package com.sri.multithreading;

class Sleep extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			IO.println("i value is "+i+" by "+name+" thread");
			try {
				Thread.sleep(1000);				
			}
			catch(InterruptedException e) {
				IO.println(e);
			}
		}
	}
}

public class SleepMethod {

	public static void main(String[] args) {
		Sleep s = new Sleep();
		s.setName("child");
		s.start();
	}

}
