package com.sri.lamda_expression;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {

	public static boolean testPredicate(int x,Predicate<Integer> predicate) {
		return predicate.test(x);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();
		Predicate<Integer> isEven = n-> n%2==0;
		Predicate<Integer> isGreaterThanTen = n-> n>10;
		Predicate<Integer> isPrime = n-> {
			int c=0;
			for(int i=1;i<n;i++) {
				if(n%i==0){
					c++;
				}
			}
			if(c==1) {
				return true;
			}
			else return false;
		};
		
		System.out.println(num+" is even :"+testPredicate(num,isEven));
		System.out.println(num+" is Greater Than Ten :"+testPredicate(num,isGreaterThanTen));
		System.out.println(num+" is prime :"+testPredicate(num,isPrime));
		sc.close();;
	}

}
