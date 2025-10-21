package com.sri.blc;

public class Employee {
int employeeId;
String employeeName;
double employeeSalary;
public void setEmployee(int a, String b, double c) {
	employeeId=a;
	employeeName=b;
	employeeSalary=c;
}
public void getEmployee() {
	System.out.println("employee id is "+employeeId);
	System.out.println("employee name is "+employeeName);
	System.out.println("employee id is "+employeeSalary);
}
}
