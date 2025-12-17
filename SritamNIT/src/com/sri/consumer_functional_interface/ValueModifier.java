package com.sri.consumer_functional_interface;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void modifyValue(int x,Consumer<Integer>consumer) {
		consumer.accept(x);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("enter increment value");
		int a = sc.nextInt();
		Consumer<Integer> doubleValue = num ->IO.println("After doubling the value : "+num*2);
		Consumer<Integer> increment = num -> IO.println("After incrementing the value by "+a+" : "+(num+a));
		Consumer<Integer> square = num -> IO.println("After squaring the value : "+(num*num));
		
		modifyValue(n,doubleValue);	
		modifyValue(n,increment);
		if(n>0) {
		modifyValue(n,square);
		}
		sc.close();
	}

}
