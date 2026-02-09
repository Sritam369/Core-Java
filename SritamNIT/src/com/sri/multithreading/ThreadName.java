package com.sri.multithreading;

class BatchAssignment extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		
		if(name!=null && name.equalsIgnoreCase("placement")) {
			this.placementBatch();
		}
		else if(name!=null && name.equalsIgnoreCase("regular")) {
			this.regularBatch();
		}
	}
	
	public void placementBatch() {
		IO.println("I'm a placement batch student");
	}
	public void regularBatch() {
		IO.println("I'm a regular batch student");
	}
}

public class ThreadName {

	public static void main(String[] args) {
		String batch=IO.readln("Enter batch");
		BatchAssignment b = new BatchAssignment();
		b.setName(batch);
		b.start();
	}

}
