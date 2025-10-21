package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.Customer;

public class CustomerData {

	public static void main(String[] args) {
		Customer cs=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("enter name");
		String name=sc.nextLine();
		cs.setCustomerData(id, name);
		cs.getCustomerData();
        sc.close();
	}

}
