package com.sri.multithreading;

class Custome{
	private double balance = 10000;
	
	public synchronized void withdraw(double amount) {
		IO.println("Going to withdraw");
		if(amount> this.balance) {
			try {
				IO.println("Less balance, Waiting for deposit...");
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.balance-=amount;
		IO.println("Balance after withdrawn "+this.balance);
	}
	
	public synchronized void deposit(double amount) {
		IO.println("Going to deposit");
		this.balance+=amount;
		IO.println("Balance after deposit is "+this.balance);
		notify();
	}
}
public class ITCDemo3 {

	public static void main(String[] args) {
		Custome c = new Custome();
		
		Thread son = new Thread() {
			public void run() {
				c.withdraw(12000);
			}
		};
		son.start();
		
		Thread dad = new Thread() {
			public void run() {
				c.deposit(3000);
			}
		};
		dad.start();

	}

}
