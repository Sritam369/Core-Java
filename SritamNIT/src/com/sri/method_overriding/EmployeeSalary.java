package com.sri.method_overriding;

import java.util.Scanner;

class Employee {
	protected int id;
	protected String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public double calculateSalary() {
		return 0.0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
class FullTimeEmployee extends Employee{
	protected double salary;
	public FullTimeEmployee(int id, String name, double salary) {
		super(id,name);
		if(salary>0) {
		this.salary = salary;
		}
		else {
			System.out.println("salary can't be negative!!!");
			System.exit(0);
		}
	}
	public double calculateSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return super.toString()+"FullTimeEmployee [salary=" + salary + "]";
	}
	
}
class PartTimeEmployee extends Employee{
	protected double hourlyRate;
	protected int hoursWorked;
	public PartTimeEmployee(int id, String name,double hourlyRate, int hoursWorked) {
		super(id,name);
		if(hourlyRate>0) {
		this.hourlyRate=hourlyRate;
		}
		else {
			System.out.println("hourly rate can't be negative");
			System.exit(0);
		}
		if(hoursWorked>0) {
		this.hoursWorked=hoursWorked;
		}
		else {
			System.out.println("hours worked can't be negative");
			System.exit(0);
		}
	}
	
	public double calculateSalary() {
		return hourlyRate*hoursWorked;
	}

	@Override
	public String toString() {
		return super.toString()+"PartTimeEmployee [hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "]";
	}
	
}

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = Integer.parseInt(sc.next());
		Employee e;
		if(choice==1) {
			System.out.println("enter your id");
			int id = Integer.parseInt(sc.next());
			System.out.println("enter your name");
			String name = sc.next();
			System.out.println("enter your salary");
			double salary = Double.parseDouble(sc.next());
			e=new FullTimeEmployee(id,name,salary);
			System.out.println(e);
			System.out.println(e.calculateSalary());
		}
		else if(choice==2) {
			System.out.println("enter your id");
			int id = Integer.parseInt(sc.next());
			System.out.println("enter your name");
			String name = sc.next();
			System.out.println("enter your rate");
			double rate = Double.parseDouble(sc.next());
			System.out.println("enter your hours worked");
			int hours = Integer.parseInt(sc.next());
			e=new PartTimeEmployee(id,name,rate,hours);
			System.out.println(e);
			System.out.println(e.calculateSalary());
		}
		sc.close();
	}

}
