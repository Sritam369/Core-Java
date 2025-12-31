package com.sri.collection_framework;

import java.util.Arrays;
import java.util.Comparator;

record Manager(Integer id,String name) {
	
}

public class ComparatorWithArray {
  void main() {
	  Manager managers[]=new Manager[3];
	  managers[0]=new Manager(111,"scott");
	  managers[1]=new Manager(333,"smith");
	  managers[2]=new Manager(222,"aryan");
	  
	  //Anonymous Inner class
	  Comparator<Manager> cmpId = new Comparator<Manager>() {
		  public int compare(Manager m1, Manager m2) {
			  return Integer.compare(m1.id(), m2.id());
		  }
	  };
	  
	  Arrays.sort(managers,cmpId);
	  for(Manager mgr:managers) {
		  IO.println(mgr);
	  }
	  
	  // By using lambda
	  Comparator<Manager> cmpName = (m1,m2)->m1.name().compareTo(m2.name());
	  Arrays.sort(managers,cmpName);
	  	  
	  for(Manager mgr:managers) {
		  IO.println(mgr);
	  }
  }
}
