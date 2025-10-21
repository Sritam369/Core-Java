package com.sri.factory_method;

import java.util.Scanner;

public class ProductData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter price");
		double price=Double.parseDouble(sc.nextLine());
        Product p1=Product.getProductObject(id, name, price);
        System.out.println(p1);
        sc.close();
	}

}
