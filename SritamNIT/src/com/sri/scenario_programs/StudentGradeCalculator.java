package com.sri.scenario_programs;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter marks");
		int marks=Integer.parseInt(sc.nextLine());
		Student s1 = new Student(name,marks);
		StudentGrade grade=calculateStudentGrade.calculateGrade(s1);
        System.out.println(grade);
        sc.close();
	}

}
