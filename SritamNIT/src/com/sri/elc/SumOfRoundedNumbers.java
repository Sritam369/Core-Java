package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.RoundeedSum;
public class SumOfRoundedNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter first number");
	int num1=sc.nextInt();
	Scanner sc2=new Scanner(System.in);
	System.out.print("enter first number");
	int num2=sc2.nextInt();
	Scanner sc3=new Scanner(System.in);
	System.out.print("enter first number");
	int num3=sc3.nextInt();
	System.out.println("sum is"+RoundeedSum.getRoundedSum(num1, num2, num3));
     sc.close();
     sc2.close();
     sc3.close();
	}

}
