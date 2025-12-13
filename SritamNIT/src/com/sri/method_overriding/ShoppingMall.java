package com.sri.method_overriding;

import java.util.Scanner;

class Customer{
	protected String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
	public void calculateBill(double ...price) {
		
	}
}
class GeneralCustomer extends Customer{

	public GeneralCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		double sum = 0;
		for(double p:price) {
			if(p>0) {
				sum+=p;
			}
			else {
				System.out.println("item price can't be negative");
			}
		}
		System.out.println("welcome to hyderabad mall");
		System.out.println("customer : "+name);
		System.out.println("total price"+sum);
		System.out.println("no discount for general customer");
	}
}
class PrimeCustomer extends Customer{
protected double interestRate=10.0;
	public PrimeCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		double sum = 0;
		for(double p:price) {
			if(p>0) {
				sum+=p;
			}
			else {
				System.out.println("item price can't be negative");
			}
		}
		double discount = sum*interestRate/100;
		double total = sum-discount;
		System.out.println("welcome to hyderabad mall");
		System.out.println("customer : "+name);
		System.out.println("total price"+sum);
		System.out.println("discount : "+discount);
		System.out.println("price after discount : "+total);
		
	}
}
class VIPCustomer extends Customer{
protected double interestRate=15.0;
	public VIPCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		double sum = 0;
		for(double p:price) {
			if(p>0) {
				sum+=p;
			}
			else {
				System.out.println("item price can't be negative");
			}
		}
		double discount = sum*interestRate/100;
		double total = sum-discount;
		System.out.println("welcome to hyderabad mall");
		System.out.println("customer : "+name);
		System.out.println("total price :"+sum);
		System.out.println("discount : "+discount);
		System.out.println("price after discount : "+total);
		
	}
}


public class ShoppingMall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter total item number");
		int totalItem = Integer.parseInt(sc.nextLine());
		double price[]=new double[totalItem];
		for(int i=0;i<price.length;i++) {
			System.out.println("enter item name");
			String itemName = sc.nextLine();
			System.out.println("enter item price");
			double prices = Double.parseDouble(sc.nextLine());
			price[i] = prices;
		}
        Customer c;
        if(choice==1) {
        	c = new GeneralCustomer(name);
        	generateBill(c,price);
        }
        else if(choice==2) {
        	c = new PrimeCustomer(name);
        	generateBill(c,price);
        }
        else {
        c = new VIPCustomer(name);
        	generateBill(c,price);
        }
	}
	
	public static void generateBill(Customer cust,double ...prices) {
		cust.calculateBill(prices);
	}
 
}
