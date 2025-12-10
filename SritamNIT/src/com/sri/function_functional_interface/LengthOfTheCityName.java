package com.sri.function_functional_interface;

import java.util.Scanner;
import java.util.function.Function;

public class LengthOfTheCityName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city name");
		String city  = sc.nextLine();
		
		Function<String,Integer> f1 = name -> name.length();
		System.out.println("the length of "+city+" : "+f1.apply(city));
        sc.close();
	}

}
