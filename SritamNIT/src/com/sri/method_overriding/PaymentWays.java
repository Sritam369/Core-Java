package com.sri.method_overriding;

class  Payment{
	public void makePayment() {
		System.out.println("generic payment");
	}
}
class CreditCard extends  Payment{
	public void makePayment() {
		System.out.println("payment through credit card");
	}
}
class DebitCard extends  Payment{
	public void makePayment() {
		System.out.println("payment through debit card");
	}
}
class Upi extends  Payment{
	public void makePayment() {
		System.out.println("payment through upi");
	}
}

public class PaymentWays {

	public static void main(String[] args) {
		Payment p =null;
		p= new Upi();
		p.makePayment();
		p= new DebitCard();
		p.makePayment();
		p= new CreditCard();
		p.makePayment();     // dynamic method dispatch
        
	}

}
