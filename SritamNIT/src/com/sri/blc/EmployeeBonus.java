package com.sri.blc;

public class EmployeeBonus {
String firstName;
String lastName;
int employeeId;
double employeeSalary;
int noOfProject;
public void setEmployeeData(String first,String last,int id,double salary,int project) {
	firstName=first;
	lastName=last;
	employeeId=id;
	employeeSalary=salary;
	noOfProject=project;
}
public void calculateSalary() {
	if(noOfProject>=5 && noOfProject<10) {
		employeeSalary=employeeSalary+5000;
	}
	else if(noOfProject>=10 && noOfProject<20) {
		employeeSalary=employeeSalary+10000;
	}
	else if(noOfProject>=20) {
		employeeSalary=employeeSalary+15000;
	}
}
public void displayDetails() {
	System.out.println("employee first name is: "+firstName);
	System.out.println("employee last name is: "+lastName);
	System.out.println("employee id is: "+employeeId);
	System.out.println("employee project is: "+noOfProject);
	System.out.println("employee salary is: "+employeeSalary);
	
}
}
