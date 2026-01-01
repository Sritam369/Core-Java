package com.sri.collection_framework;

import java.util.Collections;
import java.util.Vector;

record Employeee(Integer id,String name,Double salary)  {
	
}

public class VectorDemo2 {
 void main() {
	 Vector<Employeee> listOfEmployees = new Vector<>();
	 listOfEmployees.add(new Employeee(111,"scott",2500.0));
	 listOfEmployees.add(new Employeee(222,"allen",1500.0));
	 listOfEmployees.add(new Employeee(333,"james",3500.0));
	 
	 IO.println("printing the original object data");
	 for(Employeee emp:listOfEmployees) {
		 IO.println(emp);
	 }
	 
	 IO.println("printing the object data whose salary is > 1500D");
	 for(Employeee emp:listOfEmployees) {
		 if(emp.salary()>1500)
		 IO.println(emp);
	 }
	 
	 IO.println("sorting the object data based on name");
	 listOfEmployees.sort((e1,e2)->e1.name().compareTo(e2.name()));
	 Collections.sort(listOfEmployees,(e1,e2)->e1.name().compareTo(e2.name()));
	 for(Employeee emp:listOfEmployees) {
		 IO.println(emp);
	 }
 }
}
