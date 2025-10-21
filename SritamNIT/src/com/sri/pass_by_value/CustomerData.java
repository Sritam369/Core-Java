package com.sri.pass_by_value;

import java.util.Scanner;

public class CustomerData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bill");
		double bill=sc.nextDouble();
		Customer cust=new Customer(bill);
		System.out.println(cust);
        accept(cust);
        System.out.println(cust);
        sc.close();
	}
	public static void accept(Customer c1) {
		c1.setBill(9000);
	}

}
