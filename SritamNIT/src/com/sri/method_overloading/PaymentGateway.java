package com.sri.method_overloading;

import java.util.Scanner;

class Payment{
	public boolean validateAmount(double amount) {
		if(amount>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void makePayment(double amount) {
		if(validateAmount(amount)==true) {
			System.out.println("making payment via upi");
			System.out.println("payment is "+amount);
			System.out.println("payment successful");
		}
		else {
			System.out.println("Error : amount must be greater than 0");
			System.exit(0);
		}
	}
	
	public boolean validateCardNumber(String cardNumber) {
		if(cardNumber.length()==16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String maskCardNumber(String cardNumber) {
		return "****_****_****_"+cardNumber.substring(12)+"";
	}
	public void makePayment(String cardHolderName,String creditCardNumber,double amount) {
		if(validateCardNumber(creditCardNumber)==true && validateAmount(amount)==true) {
			System.out.println("making payment via credit card");
			System.out.println("card holder name "+cardHolderName);
			System.out.println("card number "+maskCardNumber(creditCardNumber));
			System.out.println("payment is "+amount);
			System.out.println("payment successful");
		}
		else if(validateCardNumber(creditCardNumber)==false) {
			System.out.println("Error : credit card number must be of 16 digits");
			System.exit(0);
		}
		else {
			System.out.println("Error : amount must be greater than 0");
			System.exit(0);
		}
	}
	public void makePayment(String debitCardNumber,double amount) {
		if(validateCardNumber(debitCardNumber)==true && validateAmount(amount)==true) {
			System.out.println("making payment via credit card");
			System.out.println("card number "+maskCardNumber(debitCardNumber));
			System.out.println("payment is "+amount);
			System.out.println("payment successful");
		}
		else if(validateCardNumber(debitCardNumber)==false) {
			System.out.println("Error : credit card number must be of 16 digits");
			System.exit(0);
		}
		else {
			System.out.println("Error : amount must be greater than 0");
			System.exit(0);
		}
	}
	
}

public class PaymentGateway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1/2/3");
		int choice = Integer.parseInt(sc.next());
		Payment p = new Payment();
		if(choice==1) {
			System.out.println("enter amount");
			double amount  = Double.parseDouble(sc.next());
			p.makePayment(amount);
		}
		else if(choice==2) {
			System.out.println("enter amount");
			double amount  = Double.parseDouble(sc.next());
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter cardnumber");
			String card = sc.next();
			p.makePayment(name, card, amount);
		}
		else if(choice==3) {
			System.out.println("enter amount");
			double amount  = Double.parseDouble(sc.next());
			
			System.out.println("enter cardnumber");
			String card = sc.next();
			p.makePayment(card, amount);
		}
		else {
			System.out.println("invalid input");
			
		}
		sc.close();
	}
	

}
