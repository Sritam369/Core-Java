package com.exam.nit;

import java.util.Scanner;

public class EmployeeWorkPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name =sc.nextLine();
		System.out.println("enter days worked");
		int days = Integer.parseInt(sc.nextLine());
		Employee e1 = new Employee(id,name,days);
		Employee e2 = new Employee(e1);
		System.out.println(e1);
		sc.close();

	}

}
