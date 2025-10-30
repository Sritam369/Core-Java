package com.sri.array;

import java.util.Scanner;
class EmployeeData{
	private int id;
	private String name;
	private double salary;
	public EmployeeData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee ID: "+id+"\n"+
	    "Employee Name: "+name+"\n"+
	    "Employee Salary: "+salary+"\n"+
	    "--------------------------------\n";
	}
	
}
public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int s = Integer.parseInt(sc.nextLine());
		EmployeeData empl[] = new EmployeeData[s];
		System.out.println("enter "+s+" employee data");
		for(int i=0;i<s;i++) {
			System.out.println("enter id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name =sc.nextLine();
			System.out.println("enter salary");
			double salary= Double.parseDouble(sc.nextLine());
			EmployeeData emp = new EmployeeData(id,name,salary);
			empl[i]=emp;
		}
		for(int i=0;i<s;i++) {
			System.out.println(empl[i]);
		}
		sc.close();
	}

}
