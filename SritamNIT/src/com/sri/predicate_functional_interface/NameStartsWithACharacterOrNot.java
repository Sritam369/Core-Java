package com.sri.predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class NameStartsWithACharacterOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter a character");
		String ch =sc.nextLine();
		Predicate<String> p3 = names -> names.toLowerCase().startsWith(ch);		
		System.out.println("Name starts with "+ch+" : "+p3.test(name));
        sc.close();
	}

}
