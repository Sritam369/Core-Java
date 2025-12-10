package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class VerifyName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your desired name");
		String name2 = sc.nextLine();
		Predicate<String> p4 = name1 -> name1.equalsIgnoreCase(name2);		
		
		System.out.println("enter your name");
		String name1 = sc.nextLine();
		System.out.println("name matching : "+p4.test(name1));
        sc.close();

	}

}
