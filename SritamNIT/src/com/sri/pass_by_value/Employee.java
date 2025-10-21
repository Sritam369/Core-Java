package com.sri.pass_by_value;

public class Employee {
private double salary;

public Employee(double salary) {
	this.salary = salary;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


public String toString() {
	return "Employee [salary=" + salary + "]";
}

}
