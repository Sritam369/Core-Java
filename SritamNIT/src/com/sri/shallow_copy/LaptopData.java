package com.sri.shallow_copy;

import java.util.Scanner;

public class LaptopData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter brand");
		String brand=sc.nextLine();
		System.out.println("enter price");
		double price=Double.parseDouble(sc.nextLine());
		Laptop lp=new Laptop(brand,price);
		System.out.println(lp);
		Laptop lp2=lp;
		System.out.println("enter new brand");
		String brand2=sc.nextLine();
		lp2.setBrand(brand2);
		System.out.println("enter new price");
		double price2=sc.nextDouble();
		lp2.setPrice(price2);
        System.out.println(lp);
        System.out.println(lp2);
        sc.close();
	}

}
