package com.sri.collection_framework;

import java.util.Arrays;

record Customer(Integer id,String name,Double bill) {
	
}

public class CustomerComparator {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	  Customer c[]=new Customer[size];
	  IO.println("enter "+size+" values");
	  for(int i=0;i<size;i++) {		  
		  Integer id = Integer.parseInt(IO.readln("enter id"));
		  String name = IO.readln("enter name");
		  Double bill = Double.parseDouble(IO.readln("enter bill"));
		  Customer cust = new Customer(id,name,bill);
		  c[i]=cust;
	  }  
		  IO.println("sorting the array based on id");
		  Arrays.sort(c,(c1,c2)-> Integer.compare(c1.id(),c2.id()));
		  for(Customer customer: c) {
			  IO.println(customer);
		  }
		  
		  IO.println("sorting the array based on name");
		  Arrays.sort(c,(c1,c2)-> c1.name().compareTo(c2.name()));
		  for(Customer customer: c) {
			  IO.println(customer);
		  }
		  
		  IO.println("sorting the array based on bill");
		  Arrays.sort(c,(c1,c2)-> Double.compare(c1.bill(),c2.bill()));
		  for(Customer customer: c) {
			  IO.println(customer);
		  }
		  
	  }
  }

