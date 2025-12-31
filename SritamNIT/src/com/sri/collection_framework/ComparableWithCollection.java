package com.sri.collection_framework;

import java.util.Collections;
import java.util.Vector;

record Employee2(Integer id,String name) implements Comparable<Employee2>{
	public int compareTo(Employee2 e2) {
		return this.name().compareTo(e2.name());
	}
}

public class ComparableWithCollection {
	void main() {
		   Vector<Employee2> emp = new Vector<>();
		   emp.add(new Employee2(222,"sritam"));
		   emp.add(new Employee2(111,"subrat"));
		   emp.add(new Employee2(333,"jeevan"));
		   Collections.sort(emp);
		   for(Employee2 emp2:emp) {
			   IO.println(emp2);
		   }
		}
}
