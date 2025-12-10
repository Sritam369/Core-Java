package com.sri.interface_programs;

import java.util.Scanner;

sealed interface Payment{
	void makePayment(double amount);
	void makeRefund(double amount);
}
final class CreditCardPayment implements Payment{
	private String cardHolderName;

	public CreditCardPayment(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}
	
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+cardHolderName+"" );
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("cancelling order for rs : "+amount);
		System.out.println("refunded RS : "+amount+" to credit card holder : "+cardHolderName);
	}
	
}
final class DebitCardPayment implements Payment{
	private String bankName;

	public DebitCardPayment(String bankName) {
		super();
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using debit Card bank : "+bankName+"" );	
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("cancelling order for rs : "+amount);
		System.out.println("refunded RS : "+amount+" to debit card bank : "+bankName);	
	}
	
}
final class UPIPayment implements Payment{
	private String upiId;

	public UPIPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+upiId+"" );
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("cancelling order for rs : "+amount);
		System.out.println("refunded RS : "+amount+" to upi id : "+upiId);		
	}	
}

class ShoppingCart{
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	
	public void checkOut(Payment pay) {
		System.out.println("Starting checkout for amount rs : "+totalAmount);
		if(pay instanceof CreditCardPayment c) {
			c.makePayment(totalAmount);
		}
		else if(pay instanceof DebitCardPayment d) {
			d.makePayment(totalAmount);
		}
		else if(pay instanceof UPIPayment u) {
			u.makePayment(totalAmount);
		}		
	}
	
	public void cancelOrder(Payment p) {
		System.out.println("Order cancelled. Initializing refund...");
		
		if(p instanceof CreditCardPayment c) {
			c.makeRefund(totalAmount);
		}
		else if(p instanceof DebitCardPayment d) {
			d.makeRefund(totalAmount);
		}
		else if(p instanceof UPIPayment u) {
			u.makeRefund(totalAmount);
		}
		
	}
}

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bill amount");
		double amount =  Double.parseDouble(sc.nextLine());
		System.out.println("choose payment method");
		System.out.println("1. Credit Card");
		System.out.println("2. Debit Card");
		System.out.println("3. Upi");
		System.out.println("enter your choice");
		int choice = Integer.parseInt(sc.nextLine());
		ShoppingCart s = new ShoppingCart(amount);
		Payment p;
		if(choice==1) {
			System.out.println("enter card holder name");
			String name = sc.nextLine();
			p = new CreditCardPayment(name);	
			s.checkOut(p);
			s.cancelOrder(p);
		}
		else if(choice==2) {
			System.out.println("enter debit card bank name");
			String bank = sc.nextLine();
			p = new DebitCardPayment(bank);			
			s.checkOut(p);
			s.cancelOrder(p);
		}
		else if(choice==3) {
			System.out.println("enter upi id");
			String id = sc.nextLine();
			p = new DebitCardPayment(id);			
			s.checkOut(p);
			s.cancelOrder(p);
		}
		else {
			System.out.println("invalid input");
		}
		sc.close();
	}

}
