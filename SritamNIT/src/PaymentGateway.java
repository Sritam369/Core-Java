
class Payment{
	public void processPayment() {
		System.out.println("Processing payment");
	}
}
class CreditCardPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}
class DebitCardPayment extends Payment{
	public void processPayment() {
		System.out.println("Processing debit card payment");
	}
}
class Upi extends Payment{
	public void processPayment() {
		System.out.println("Processing upi payment");
	}
}

public class PaymentGateway {

	public static void main(String[] args) {
		Payment p=new CreditCardPayment();
		Payment p2=new DebitCardPayment();
		Payment p3=new Upi();
		PaymentWays(p,p2,p3);
	}
     public static void PaymentWays(Payment ...payments) {
    	 for(Payment p : payments) {
    		 p.processPayment();
    	 }
     }
}
