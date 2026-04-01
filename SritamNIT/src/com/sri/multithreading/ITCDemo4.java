package com.sri.multithreading;

class TicketSystem{
	int availableTickets = 5;
	
	public synchronized void bookTicket(int noOfTicket) {
		while(availableTickets<noOfTicket) {
			IO.println("Not enough tickets, waiting for cancellation");
			try {
				wait();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.availableTickets-=noOfTicket;
		IO.println(noOfTicket+" no. of tickets are booked, available ticket is: "+availableTickets);
	}
	
	public synchronized void cancelTicket(int num) {
		this.availableTickets+=num;
		IO.println(num+" tickets are cancelled, available tickets are: "+availableTickets);
		notify();
	}
}
public class ITCDemo4 {

	public static void main(String[] args) {
		TicketSystem t = new TicketSystem();
		
		Thread t1 = new Thread() {
			public void run() {
				int []tickets = {2,4,4};
				
				for(int ticket:tickets) {				
					t.bookTicket(5);
					try {
						Thread.sleep(2000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
                 int []tickets = {1,3,2};
				
				for(int ticket:tickets) {				
					t.cancelTicket(ticket);
					try {
						Thread.sleep(2000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
		
	}

}
