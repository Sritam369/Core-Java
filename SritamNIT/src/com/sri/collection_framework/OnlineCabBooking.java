package com.sri.collection_framework;

import java.util.ArrayList;

record Customers(int custId,String customerName,String pickUpLocation,String dropLocation,int distance,String phone){
	
	public Customers{
		
		if(custId<0) {
			IO.println("Customer id must be positive");
		}
		if(customerName.isEmpty() || customerName.isBlank() || customerName.equals(null)) {
			IO.println("Customer name cannot be null or blank.");
		}
		if(pickUpLocation.isEmpty() || pickUpLocation.isBlank() || pickUpLocation.equals(null)) {
			IO.println("Pickup location cannot be null or blank.");
		}
		if(dropLocation.isEmpty() || dropLocation.isBlank() || dropLocation.equals(null)) {
			IO.println("Drop location cannot be null or blank.");
		}
		if(distance<0) {
			IO.println("Distance can't be negative");
		}
		if(phone.length()!=10) {
			IO.println("Phone number must be 10 digits only.");
		}
		try{
		  int x = Integer.parseInt(phone);
		  if(x<0) {
			  throw new IllegalArgumentException();
		  }
		}
		
		catch(IllegalArgumentException e) {
			IO.println("Phone number must be positive");
			System.exit(0);
		}
	}
}

class CustomerService{
	private ArrayList<Customers>customer;
	public CustomerService() {
		this.customer=new ArrayList<Customers>();
	}
	
	public void addCustomer(Customers cust) {
		customer.add(cust);
	}
	private boolean isFirstCustomer(Customers cust) {

		boolean isFirst=true;
		for(Customers c:customer) {
			if(cust.phone().compareTo(c.phone())==1) {
				 isFirst=false;			
			}			
		}
		if(isFirst) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateBill(Customers cust) {
		if(isFirstCustomer(cust)) {
			return 0.0;
		}
		if(cust.distance()<=4) {
			return 80.0;
		}
		else {
			if(isFirstCustomer(cust)) {
				return 0.0;
			}
			else {
				return ((cust.distance()-4)+80)*cust.distance();
			}
		}
	}
	public String printBill(Customers cust) {
		return ""+cust.customerName()+" Please pay your bill of Rs. "+this.calculateBill(cust)+"";
	}
}

public class OnlineCabBooking {
  void main() {
	  CustomerService c2=null;
	  Customers c=null;
	  
	for(int i=1;i<3;i++) {	 
	  int id = Integer.parseInt(IO.readln("enter customer id"));
	  String name = IO.readln("enter name");
	  String pick = IO.readln("enter pick up point");
	  String drop = IO.readln("enter drop point");
	  int distance = Integer.parseInt(IO.readln("enter customer distance"));
	  String phone = IO.readln("enter customer phone number");
	  
	  c = new Customers(id,name,pick,drop,distance,phone);
	  
	  c2 = new CustomerService();
	  c2.calculateBill(c);
	  c2.addCustomer(c);
	}
	  IO.println(c2.printBill(c));
	  
  }
}
