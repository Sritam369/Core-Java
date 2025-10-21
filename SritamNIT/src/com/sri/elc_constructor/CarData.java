package com.sri.elc_constructor;

import java.util.Scanner;

import com.sri.blc_constructor.Car;

public class CarData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter model");
		String model=sc.nextLine();
		System.out.println("enter year");
		int year=Integer.parseInt(sc.nextLine());
		System.out.println("enter price");
		double price=Double.parseDouble(sc.nextLine());
		Car cr = new Car(model,year,price);
		System.out.println(cr);
		sc.close();
	}

}
