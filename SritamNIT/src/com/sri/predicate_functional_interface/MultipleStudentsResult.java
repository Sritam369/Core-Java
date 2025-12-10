package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class MultipleStudentsResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Student> p5 = student -> student.marks()>60;
		
		System.out.println("enter student numbers");
		int size = Integer.parseInt(sc.nextLine());
		Student students[] = new Student[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter student id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter student name");
			String name = sc.nextLine();
			System.out.println("enter student marks");
			double marks = Double.parseDouble(sc.nextLine());
			students[i]=new Student(id,name,marks);
		}
		int num = 1;
		for(Student s : students) {		
			System.out.println("student"+num+" is pass : "+p5.test(s));
			num++;
		}
		 sc.close();
	}

}
