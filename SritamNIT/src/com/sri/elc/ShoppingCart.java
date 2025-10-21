package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.Discount;
public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name");
		String name=sc.nextLine();
		System.out.print("enter amount");
		double finalBill=Double.parseDouble(sc.nextLine());
		System.out.println("-----Bill Summary-----");
		System.out.println("name of the customer is "+name);
		System.out.println("original bill is "+finalBill);
		Discount.calculateDiscount(finalBill);
        sc.close();
	}

}
