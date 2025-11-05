package com.sri.array;


import java.util.Scanner;

public class StudentArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s=Integer.parseInt(sc.nextLine());
		Student arr[]=new Student [s];
		for(int i=0;i<s;i++) {
			System.out.println("enter id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter marks");
			int marks = Integer.parseInt(sc.nextLine());
			arr[i]=new Student(id,name,marks);
		}
		for(int i=0;i<s;i++) {
			System.out.println(arr[i]);
		}
          sc.close();
	}

}
