package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		Employee em=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter employee id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.print("enter employee name");
        String name=sc.nextLine();
        System.out.print("enter employee salary");
        double salary=Double.parseDouble(sc.nextLine());
        em.setEmployee(id, name, salary);
        em.getEmployee();
        sc.close();
        
	}

}
