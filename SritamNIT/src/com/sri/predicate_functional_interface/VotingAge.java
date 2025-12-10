package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class VotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Predicate<Integer> p1 = age -> age>18;
			
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Eligible for voting : "+p1.test(age));
        sc.close();
	}

}
