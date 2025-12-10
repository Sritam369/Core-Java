package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

record Student(int id,String name,double marks) {}

public class StudentPassOrFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Student> p5 = student -> student.marks()>60;
		System.out.println("enter student id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("enter student name");
		String name = sc.nextLine();
		System.out.println("enter student marks");
		double marks = Double.parseDouble(sc.nextLine());
        System.out.println("student is pass : "+p5.test(new Student(id,name,marks)));
        sc.close();
	}

}
