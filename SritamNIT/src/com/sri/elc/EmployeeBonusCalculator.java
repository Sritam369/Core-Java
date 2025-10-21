package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.EmployeeBonus;

public class EmployeeBonusCalculator {

	public static void main(String[] args) {
		EmployeeBonus eb= new EmployeeBonus();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee first name");
		String first=sc.nextLine();
		System.out.println("enter employee last name");
		String last=sc.nextLine();
		System.out.println("enter employee id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter employee salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("enter employee project");
		int project=Integer.parseInt(sc.nextLine());
		eb.setEmployeeData(first, last, id, salary, project);
		eb.calculateSalary();
		eb.displayDetails();
		sc.close();
	}

}
