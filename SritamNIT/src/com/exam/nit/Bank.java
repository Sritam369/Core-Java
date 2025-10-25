package com.exam.nit;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter name");
	 String name=sc.nextLine();
	 System.out.println("enter principal");
	 double principal=Double.parseDouble(sc.nextLine());
	 System.out.println("enter time");
	 double time=Double.parseDouble(sc.nextLine());
	 BankAccount b1 = new BankAccount(name,principal,time);
	 BankAccount b2 = new BankAccount(b1);
     System.out.println(b1.toString());
     sc.close();
	}

}
