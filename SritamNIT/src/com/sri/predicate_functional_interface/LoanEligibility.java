package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

record Customer(String name,Double salary,Integer creditScore, Integer age) {}

public final class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter salary");
		double salary =Double.parseDouble(sc.nextLine());
		System.out.println("enter credit score");
		int creditScore =Integer.parseInt(sc.nextLine());
		System.out.println("enter age");
		int age =Integer.parseInt(sc.nextLine());
		Customer c = new Customer(name,salary,creditScore,age);
		Predicate<Customer> eligible = loan -> loan.salary()>25000 && loan.creditScore()>700 && loan.age()>21;
		boolean isEligible = eligible.test(c);
		if(isEligible) {
			System.out.println(name+" is eligible for loan");
		}
		else {
			System.out.println(name+" is not eligible for loan");
		}
       sc.close();
	}

}
