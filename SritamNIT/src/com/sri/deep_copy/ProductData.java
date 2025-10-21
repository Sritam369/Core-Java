package com.sri.deep_copy;

import java.util.Scanner;

public class ProductData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price");
		double price=sc.nextDouble();
		Product p1=new Product(price);
		Product p2=new Product(price);
		System.out.println(p1);
        System.out.println(p2);
		System.out.println("enter price2");
		double price2=sc.nextDouble();
		p2.setPrice(price2);
        System.out.println(p1);
        System.out.println(p2);
        sc.close();
	}

}
