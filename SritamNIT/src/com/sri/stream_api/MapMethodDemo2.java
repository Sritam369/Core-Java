package com.sri.stream_api;

import java.util.ArrayList;

record Employee2(Integer id,String name,Double salary) {
	
}

public class MapMethodDemo2 {
  void main() {
	  ArrayList<Employee2>list = new ArrayList<>();
	  list.add(new Employee2(101,"scott",800d));
	  list.add(new Employee2(102,"smith",1200d));
	  list.add(new Employee2(101,"alen",1500d));
	  list.add(new Employee2(101,"martin",1800d));
	  list.add(new Employee2(101,"john",2000d));
	  
	  IO.println("Original Employee data with base salary");
	  list.forEach(IO::println);
	  
	  // add 500d in their salary
	  list.stream().map(emp->emp.salary()+500).forEach(IO::println);
  }
}
