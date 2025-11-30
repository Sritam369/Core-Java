package com.sri.method_overriding;

class Payments {
	public double makePayment(double amount) {
		return 0.0;
	}
}
class CreditCards extends Payments{
	public double makePayment(double amount) {
		return amount;
	}
	public void offer() {
		System.out.println("offers of 2 days goa trip.");
	}
}
class DebitCards extends Payments{
	public double makePayment(double amount) {
		return amount;
	}
	
}
class Upi2 extends Payments{
	public double makePayment(double amount) {
		return amount;
	}
	public void offer() {
		System.out.println("offers of 1000rs cashback.");
	}
}
public class PaymentUsingInstanceof {

	public static void main(String[] args) {
		Payments p ;
		p=new CreditCards();
		paymentGateway(p);
		p=new DebitCards();
		paymentGateway(p);
		p=new Upi2();
		paymentGateway(p);
	}
	public static void paymentGateway(Payments pay) {
		if(pay instanceof CreditCards c) {
			System.out.println(c.makePayment(1000));
			c.offer();
		}
		else if(pay instanceof DebitCards d) {
			System.out.println(d.makePayment(2000));
		}
		else {
			Upi2 upi = (Upi2)pay;
			System.out.println(upi.makePayment(3000));
			upi.offer();
		}
	}

}
