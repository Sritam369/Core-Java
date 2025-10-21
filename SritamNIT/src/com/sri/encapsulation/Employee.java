package com.sri.encapsulation;

public class Employee {
private String name;
private double salary;
public Employee(String name, double salary) {
	
	this.name = name;
	this.salary = salary;
}
public void setEmployeSalary(double salary) {
	if(salary<this.salary) {
		System.err.println("invalid data");
		System.exit(0);
	}
	else {
	this.salary=salary;
	
	}
}
public double getSalary() {
	return salary;
}

public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}

}
