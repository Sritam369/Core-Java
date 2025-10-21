package com.sri.oop;

import java.util.Scanner;

public class CustomerBank {

	public static void main(String[] args) {
		Customer cs=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("amount to be deposited");
		double amount=sc.nextDouble();
		System.out.println("amount to be withdrawn");
		double amount2=sc.nextDouble();
		cs.deposit(amount);
		cs.withdraw(amount2);
		System.out.println("total balance is: "+cs.checkBalance());
        sc.close();
	}

}
