package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.NextMultipleOfHundred;
public class GetNextMultipleOfHundred {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
        int num=sc.nextInt();
        System.out.println("result is"+NextMultipleOfHundred.getNumber(num));
        sc.close();
	}

}
