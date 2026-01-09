package com.sri.collection_framework;

import java.util.ArrayList;

record Customers(int custId,String customerName,String pickUpLocation,String dropLocation,int distance,String phone){
	
	public Customers{
		try {
		 if (custId <= 0)
	            throw new IllegalArgumentException("Validation Error: Customer ID must be positive.");

	        if (customerName == null || customerName.isBlank())
	            throw new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");

	        if (pickUpLocation == null || pickUpLocation.isBlank())
	            throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");

	        if (dropLocation == null || dropLocation.isBlank())
	            throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");

	        if (distance < 0)
	            throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");

	        if (phone == null || phone.length()!=10 || !phone.matches("\\d++"))
	            throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
	    }
		catch(IllegalArgumentException e) {
			IO.println(e.getMessage());
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

		for (Customers c : customer) {
          if (cust.phone().equals(c.phone())) {
              return false;
          }
		}
		
		return true;

	}
	
	public double calculateBill(Customers cust) {
		if(isFirstCustomer(cust)) {
			return 0.0;
		}
		 if(cust.distance()<=4) {
			return 80.0;
		}
		 return ((cust.distance()-4)+80)*6;
	}
	public String printBill(Customers cust) {
		return ""+cust.customerName()+" Please pay your bill of Rs. "+this.calculateBill(cust)+"";
	}
}

public class OnlineCabBooking {
  void main() {
	  CustomerService c2= new CustomerService();
	  Customers c=null;
	  
	for(int i=1;i<3;i++) {	 
	  int id = Integer.parseInt(IO.readln("enter customer id"));
	  String name = IO.readln("enter name");
	  String pick = IO.readln("enter pick up point");
	  String drop = IO.readln("enter drop point");
	  int distance = Integer.parseInt(IO.readln("enter customer distance"));
	  String phone = IO.readln("enter customer phone number");
	  
	  c = new Customers(id,name,pick,drop,distance,phone);
	  IO.println(c2.printBill(c));
	  c2.addCustomer(c);
	}
	 
	  
  }
}
