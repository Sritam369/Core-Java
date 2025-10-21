package com.sri.pass_by_value;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		Employee emp1=new Employee(salary);
		System.out.println(emp1);
        accept(emp1);
        System.out.println(emp1);
        
	}
	public static void accept(Employee emp) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		emp=new Employee(salary);
		emp.setSalary(9000);
		System.out.println(emp);
	}

}
