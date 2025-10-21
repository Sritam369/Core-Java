package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.TwoDigitsDifference;
public class GetDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a two digit number");
		int num=sc.nextInt();
		System.out.println("difference is "+TwoDigitsDifference.difference(num));
        sc.close();
	}

}
