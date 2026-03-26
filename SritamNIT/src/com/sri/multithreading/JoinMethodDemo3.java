package com.sri.multithreading;

class OTPVerification extends Thread {
	public void run() {
		IO.println("verifying otp");
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}

class BalanceCheck extends Thread{
	public void run() {
		IO.println("checking balance");
		try {
		   Thread.sleep(1500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		IO.println("sufficient balance available");
	}
}

public class JoinMethodDemo3 {

	void main() throws InterruptedException {
		BalanceCheck b = new BalanceCheck();
		OTPVerification o = new OTPVerification();
		b.start();
		o.start();
		b.join();
		o.join();
		
		IO.println("Transaction successfull");
	}
}
