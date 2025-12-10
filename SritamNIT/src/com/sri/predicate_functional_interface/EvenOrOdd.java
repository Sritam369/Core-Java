package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Integer> p2 = num -> num%2==0;
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("Number is even : "+p2.test(num));
        sc.close();

	}

}
