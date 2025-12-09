package com.sri.record;

record Employee(int id, String name) {
	public Employee{
		if(id<=0) {
		  System.err.println("id must be positive");
	      System.exit(0);	
		}
	}
}

public class EmployeeRecord {

	public static void main(String[] args) {
		Employee emp = new Employee(111,"sritam");
        System.out.println(emp);
	}

}
