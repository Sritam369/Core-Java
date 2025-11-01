package com.exam.nit;

import java.util.Scanner;

public class CopyStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enyer anme");
		String name=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		StudentDetails s1 = new StudentDetails(name,age);
		StudentDetails s2 = new StudentDetails(s1);
		System.out.println("Original data");
		System.out.println(s1);
		System.out.println("copied data");
		System.out.println(s2);
		System.out.println("After modification");
		System.out.println("Original data");
		System.out.println(s1);
		s2.update("sss", 80);
		System.out.println("copied data");
		System.out.println(s2);
		
		sc.close();
		
		

	}

}
