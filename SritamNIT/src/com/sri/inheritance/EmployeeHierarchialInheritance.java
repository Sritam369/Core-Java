package com.sri.inheritance;

import java.util.Scanner;

class Employee2{
	protected int empId;
	protected String empName;
	protected double empSalary;
	
	public Employee2(int empId, String empName, double empSalary) {
		super();
		if(empId>0) {
			this.empId = empId;
		}
		else {
			System.out.println("invalid employee id");
			System.exit(0);
		}
		if(empName!="") {
		this.empName = empName;
	}
	else {
		System.out.println("employee name can't be null");
		System.exit(0);
	}
		if(empSalary>0) {
		this.empSalary = empSalary;
		}
		else {
			System.out.println("employee salary can't b e 0 or negative");
			System.exit(0);
		}
	}
}
class PermanentEmployee2 extends Employee2{
	protected double providentFund=super.empSalary*12/100;

	public PermanentEmployee2(int empId, String empName, double empSalary) {
		super(empId, empName, empSalary);
	}
	@Override
	public String toString() {
		return "PermanentEmployee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", providentFund=" + providentFund + " ]";
	}
	public void netSalary() {
		double net = super.empSalary+this.providentFund;
	}
}
class ConteractEmployee extends Employee2{
	protected int contractDuration;

	public ConteractEmployee(int empId, String empName, double empSalary, int contractDuration) {
		super(empId, empName, empSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ConteractEmployee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", contractDuration=" + contractDuration + " years]";
	}
	
}

public class EmployeeHierarchialInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id2 = Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name2 = sc.nextLine();
		System.out.println("enter salary");
		double sal2 = Double.parseDouble(sc.nextLine());
		PermanentEmployee2 pe = new PermanentEmployee2(id2,name2,sal2);
		System.out.println(pe);
		
		System.out.println("enter id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter salary");
		double sal = Double.parseDouble(sc.nextLine());
		System.out.println("enter contract duration");
		int duration = Integer.parseInt(sc.nextLine());
		ConteractEmployee ce = new ConteractEmployee(id,name,sal,duration);
		System.out.println(ce);
         sc.close();
	}

}
