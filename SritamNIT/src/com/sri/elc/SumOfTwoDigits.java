package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.TwoDigitsSum;
public class SumOfTwoDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter a number");
		int sumOfDigits=sc.nextInt();
		TwoDigitsSum.getSumOfDigits(sumOfDigits);
        sc.close();
	}

}
