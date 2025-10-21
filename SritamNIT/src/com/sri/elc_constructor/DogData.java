package com.sri.elc_constructor;

import java.util.Scanner;

import com.sri.blc_constructor.Dog;

public class DogData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter color");
		String color=sc.nextLine();
		System.out.println("enter age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("enter height");
		double height=Double.parseDouble(sc.nextLine());
		Dog dg=new Dog(name,color,age,height);
		System.out.println(dg);
		sc.close();
	}

}
