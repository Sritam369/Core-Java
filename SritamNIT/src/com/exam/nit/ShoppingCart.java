package com.exam.nit;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of days");
		int day=sc.nextInt();
		System.out.println("enter rent");
		int roomrate=sc.nextInt();
		double totalRent=Hotel.calculateTotalAmount(roomrate, day);
		System.out.println("Customer Name: Sritam");
		System.out.println("Hotel name:  Hyderabad palace");
		System.out.println("room rate per day : "+roomrate);
		System.out.println("days stayed : "+day);
		System.out.println("discounted rent is: "+Hotel.calculateDiscountedAmount(day, totalRent));
		sc.close();

	}

}
