package com.sri.inheritance;

class Employee{
	protected double salary=70000;
}
class Developer extends Employee{
	protected double salary=90000;
	public void getSalaryInfo() {
		System.out.println("employee salary: "+super.salary);
		System.out.println("developer salary: "+salary);
	}
}

public class VariableHiding {

	public static void main(String[] args) {
		Developer developer=new Developer();
		developer.getSalaryInfo();

	}

}
