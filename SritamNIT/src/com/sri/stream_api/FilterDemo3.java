package com.sri.stream_api;

import java.util.List;
import java.util.stream.Stream;

record Employee(Integer id,String name,Double sal) {
	
}

public class FilterDemo3 {
  void main() {

	  List<Employee>list = List.of(new Employee(101,"sri",10000.0), new Employee(101,"sri",10000.0),new Employee(101,"sri",10000.0),new Employee(101,"sri",10000.0));
	  list.stream().filter(emp -> emp.sal()>5000).toList().forEach(emp -> IO.println(emp.name()));
  }
}
