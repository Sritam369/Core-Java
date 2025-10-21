package com.sri.elc_tostring;

import java.util.Scanner;

import com.sri.blc_tostring.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		Employee em=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter salary");
        double salary=Double.parseDouble(sc.nextLine());
        
        em.setEmployeeData(id, name, salary);
        System.out.println(em.toString());
        em.calaculateIncrement();
        
        sc.close();
	}

}
