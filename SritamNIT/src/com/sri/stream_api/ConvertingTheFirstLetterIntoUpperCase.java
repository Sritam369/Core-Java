package com.sri.stream_api;

import java.util.List;

record Person(String name,Integer age) {
	
}

record Emp(Integer id,Double salary) {
	
}

public class ConvertingTheFirstLetterIntoUpperCase {
  public static void main(String[] args) {
	  List<Person>list = List.of(new Person("sritam",25),new Person("subrat",24),new Person("jeevan",23));
//	  List<Person> sorted = list.stream().sorted((p1,p2)->p1.age().compareTo(p2.age())).toList();
//	  IO.println(sorted);
	  
//	  List<String>change = list.stream().map(n-> n.name().toUpperCase()).toList();
//	  IO.println(change);
	  
	  List<Emp> list2 = List.of(new Emp(101,25000.0),new Emp(102,45000.0),new Emp(103,55000.0));
//	  List<Emp> sort = list2.stream().sorted((e1,e2)->e2.salary().compareTo(e1.salary())).toList();
//	  IO.println(sort);
	  
//	  List<String>change2 = list.stream().map(n-> n.name().toLowerCase()).toList();
//	  IO.println(change2);
//	  
//	 List<Emp> filter =  list2.stream().filter(n-> n.salary()>30000).toList();
//	 IO.println(filter);
	  
	  list.stream().map(per->per.name().substring(0,1).toUpperCase()+per.name().substring(1)).forEach(IO::println);
  }
}
