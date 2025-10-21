package com.sri.encapsulation;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		Employee em=new Employee(name,salary);
		System.out.println(em);
		System.out.println("enter increment");
		double increment=sc.nextDouble();
		em.setEmployeSalary(em.getSalary()+increment);
		System.out.println(em);
		sc.close();
	}

}
