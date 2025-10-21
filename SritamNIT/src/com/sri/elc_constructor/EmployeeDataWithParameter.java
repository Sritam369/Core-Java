package com.sri.elc_constructor;

import java.util.Scanner;

import com.sri.blc_constructor.EmployeeWithParameter;

public class EmployeeDataWithParameter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String first=sc.nextLine();
		System.out.println("enter last name");
		String last=sc.nextLine();
		System.out.println("enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("enter project");
		int project=Integer.parseInt(sc.nextLine());
		EmployeeWithParameter em=new EmployeeWithParameter(first,last,id,salary,project);
		System.out.println(em);
		em.calculatyeSalary();
		sc.close();
	}

}
