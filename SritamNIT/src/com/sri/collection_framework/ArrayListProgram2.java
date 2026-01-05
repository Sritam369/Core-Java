package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.Collections;

//Sorting the object in arraylist

record Customer2(Integer custId,String custName,Double custSal)implements Comparable<Customer2>{
	@Override
	public int compareTo(Customer2 c2) {
		return this.custName().compareTo(c2.custName());
	}
	
}

public class ArrayListProgram2 {
   void main() {
	   ArrayList<Customer2> listOfCustomers = new ArrayList<>();
	   listOfCustomers.add(new Customer2(111,"sritam",25000d));
	   listOfCustomers.add(new Customer2(222,"subrat",35000d));
	   listOfCustomers.add(new Customer2(333,"jeevan",45000d));
	   IO.println("Original Customer object");
	   listOfCustomers.forEach(IO::println);
	   IO.println("After sorting Customer object");
	   Collections.sort(listOfCustomers);
	   listOfCustomers.forEach(IO::println);
   }
}
