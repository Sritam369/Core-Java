package com.sri.multithreading;

class Sleep2 extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
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

public class SleepMethodDemo2 {

	public static void main(String[] args) {
		Sleep2 s1 = new Sleep2();
		s1.setName("child1");
		s1.start();
		
		Sleep2 s2 = new Sleep2();
		s2.setName("child2");
		s2.start();
	}

}
