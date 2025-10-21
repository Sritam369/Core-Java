package com.sri.blc_constructor;

public class EmployeeWithParameter {
private String firstName;
private String lastName;
private int id;
private double salary;
private int noOfProject;
public EmployeeWithParameter(String firstName, String lastName, int id, double salary, int noOfProject) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.id = id;
	this.salary = salary;
	if(noOfProject>0) {
	this.noOfProject = noOfProject;
	}
	else {
		System.err.println("no of projects must be positive");
		System.exit(0);
	}
}
public void calculatyeSalary() {
	if(noOfProject>5 && noOfProject<10) {
		salary+=5000;
	}
	else if(noOfProject>=10 && noOfProject<20) {
		salary+=10000;
	}
	else if(noOfProject<=5) {
		System.err.println("projects must be more than 5");
	}
	else {
		salary+=15000;
	}
	System.out.println("updated salary is"+salary);
}

public String toString() {
	return "EmployeeWithParameter [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", salary="
			+ salary + ", noOfProject=" + noOfProject + "]";
}

}
