package com.sri.collection_framework;

import java.util.Arrays;

record Employee(Integer id,String name) implements Comparable<Employee>{
	public int compareTo(Employee e2) {
		return this.name().compareTo(e2.name());
	}
}

public class ComparableArrayProgram {
	void main() {
   Employee employees[]=new Employee[3];
   employees[0]=new Employee(222,"sritam");
   employees[1]=new Employee(333,"subrat");
   employees[2]=new Employee(111,"jeevan");
   Arrays.sort(employees);
   for(Employee emp:employees) {
	   IO.println(emp);
   }
}
	}
