package com.exam.nit;

import java.util.Scanner;

interface Predicate<T>{
	boolean test(T x);
}
interface Predicate2<T>{
	boolean test(T x);
}


public class CombineTwoPredicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = Integer.parseInt(sc.next());
		Predicate<Integer> check = num -> num%2==0;
		Predicate2<Integer> check2 = num -> num>10;
		if(check.test(number) && check2.test(number)) {
			System.out.println("both conditions satisfies : true");
		}
		else {
			System.out.println("both conditions satisfies : false");
		}
		sc.close();
	}

}
