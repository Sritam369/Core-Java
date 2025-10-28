package com.exam.nit;

import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter attendance");
		int attendance = sc.nextInt();
		System.out.println("enter marks");
		int marks = sc.nextInt();
		System.out.println("enter lab performance");
		int lab = sc.nextInt();
		System.out.println("enter daily task score");
		int score = sc.nextInt();
		Student s = new Student(name,attendance,marks,lab,score);
		System.out.println(s);
		sc.close();

	}

}
