package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.BiggerNumber;

public class FindBiggerNumber {

	public static void main(String[] args) {
		BiggerNumber bn=new BiggerNumber();
        Scanner sc=new Scanner(System.in);
        System.out.print("first number is ");
        int num1=sc.nextInt();
        System.out.print("second number is ");
        int num2=sc.nextInt();
        System.out.print("third number is ");
        int num3=sc.nextInt();
        sc.close();
        bn.setBiggerNumber(num1, num2, num3);
        bn.getBiggerNumber();
	}

}
