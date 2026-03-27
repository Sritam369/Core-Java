package com.sri.multithreading;

class Tatkal implements Runnable{
	public void run() {
		IO.println(Thread.currentThread().getName()+" has booked the ticket under tatkal scheme");
	}
}
class PremiumTatkal implements Runnable{
	public void run() {
		IO.println(Thread.currentThread().getName()+" has booked the ticket under premium tatkal scheme");
	}
}
public class RunnableDemo2 {

	void main() throws InterruptedException {
		Thread t1 = new Thread(new Tatkal(),"scott");
		Thread t2 = new Thread(new Tatkal(),"allen");
		t1.start();
		t2.start();
	}
}
