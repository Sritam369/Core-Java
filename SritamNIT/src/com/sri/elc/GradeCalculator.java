package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.Student;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter marks");
		double grade=sc.nextDouble();
		Student.calculateGrade(grade);
        sc.close();
	}

}
