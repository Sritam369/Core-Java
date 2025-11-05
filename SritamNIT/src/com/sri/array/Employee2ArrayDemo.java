package com.sri.array;


import java.util.Scanner;

public class Employee2ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int s=Integer.parseInt(sc.nextLine());
		Employee2 arr[]=new Employee2[s];
		for(int i=0;i<s;i++) {
			System.out.println("enter id");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter salary");
			double salary = Double.parseDouble(sc.nextLine());
			arr[i]=new Employee2(id,name,salary);
		}
		for(int i=0;i<s;i++) {
			System.out.println(arr[i]);
		}
          sc.close();
	}

}
