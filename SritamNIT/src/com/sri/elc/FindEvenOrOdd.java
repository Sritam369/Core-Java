package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.EvenOdd;
public class FindEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter number");
		int num=sc.nextInt();
		System.out.println("number is"+EvenOdd.isEven(num));
		sc.close();

	}

}
