package com.sri.interface_programs;

import java.util.Scanner;

interface Payments{
	void processPayment();
	void applyDiscount();
}
class CreditCardPayments implements Payments{

	@Override
	public void processPayment() {
		System.out.println("processing credit card payment...");
	}
	@Override
	public void applyDiscount() {
		System.out.println("applying 10% discount fpr credit card payment");		
	}
	
}
class UpiPayments implements Payments{
	@Override
	public void processPayment() {
		System.out.println("processing upi payment...");
	}
	@Override
	public void applyDiscount() {
		System.out.println("applying 5% discount for upi payment");		
	}
}

class PaymentGateway{
	public Payments initiatePayment(String paymentType) {
		Payments p=null;
		if(paymentType.equalsIgnoreCase("creditcard")) {
			System.out.println("Initiating credit card payment");
			 p=new CreditCardPayments();
			 p.processPayment();
			 p.applyDiscount();
			
		}
		else if(paymentType.equalsIgnoreCase("upi")) {
			System.out.println("Initiating upi payment");
			 p=new UpiPayments();
			 p.processPayment();
			 p.applyDiscount();
	         
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		return p;
	}
}



public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PaymentGateway p2 = new PaymentGateway();
        System.out.println("enter payment type [creditcard/upi]");
        String type = sc.nextLine();
        p2.initiatePayment(type);
        sc.close();
	}

}
