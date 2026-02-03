package com.sri.stream_api;

import java.util.Optional;

class Employee4{
	private Integer id;
	private String name;
	
	public Employee4() {
		
	}
	
	public Employee4(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Optional<Integer> getId() {
		return Optional.ofNullable(this.id);
	}
	public Optional<String> getName() {
		return Optional.ofNullable(this.name);
	}
}

public class OptionalClassMethods3 {
   void main() {
	   Employee4 e1 = new Employee4();
	   
	   Optional<Integer> id = e1.getId();
	   IO.println(id.orElse(00));
	   Optional<String> name = e1.getName();
	   IO.println(name.orElse("no name"));
	   
	   IO.println(".....................");
	   Employee4 e2 = new Employee4(101,"scott");
	   Optional<Integer> id2 = e2.getId();
	   id2.ifPresent(IO::println);
	   Optional<String> name2 = e2.getName();
	   name2.ifPresent(IO::println);
	   
	   
   }
}
