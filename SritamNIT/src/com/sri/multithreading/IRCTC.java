package com.sri.multithreading;

class Customer implements Runnable{
	
	private int availableSeats=1;
	private int wantedSeat;
	
	public Customer(int wantedSeat) {
		this.wantedSeat=wantedSeat;
	}
	
	public void run() {
		
		String name = null;
		if(availableSeats>=wantedSeat) {
			name = Thread.currentThread().getName();
			IO.println(wantedSeat+" berth is reserved for "+name);
			availableSeats-=wantedSeat;
		}
		else {
			name = Thread.currentThread().getName();
			IO.println("Sorry!!! "+name+" seat is not available");
		}
		
	}
}
public class IRCTC {

	void main() throws InterruptedException {
		
		Customer cust = new Customer(1);
		Thread t1 = new Thread(cust,"sritam");
		Thread t2 = new Thread(cust,"subrat");
		t1.start();
		t2.start();
	}
}
