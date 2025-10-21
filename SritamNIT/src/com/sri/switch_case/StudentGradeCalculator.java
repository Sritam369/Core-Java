package com.sri.switch_case;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark");
		int mark=Integer.parseInt(sc.nextLine());
		switch(mark) {
		case 90,91,92,93,94,95,96,97,98,99,100-> System.out.println("grade is A");
		case 80,81,82,83,84,85,86,87,88,89-> System.out.println("grade is B");
		case 70,71,72,73,74,75,76,77,78,79-> System.out.println("grade is C");
		case 60,61,62,63,64,65,66,67,68,69-> System.out.println("grade is D");
		default->System.out.println("grade is E");
		}
		sc.close();

	}

}
