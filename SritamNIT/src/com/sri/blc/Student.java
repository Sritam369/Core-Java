package com.sri.blc;

public class Student {
 public static void calculateGrade(double marks) {
	 if(marks>=90) {
		 System.out.println("grade is A+");
	 }
	 else if(marks>=75) {
		 System.out.println("grade is A");
	 }
	 else if(marks>=60) {
		 System.out.println("grade is B");
	 }
	 else if(marks>=40) {
		 System.out.println("grade is C");
	 }
	 else {
		 System.out.println("Fail");
	 }
 }
}
