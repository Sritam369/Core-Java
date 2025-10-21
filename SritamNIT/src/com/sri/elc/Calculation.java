package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.Calculator;
public class Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter two numbers");
		int addition=sc.nextInt();
		System.out.print("enter two numbers");
		int addition2=sc.nextInt();
		Calculator.add(addition, addition2);
		Scanner sc2=new Scanner(System.in);
		System.out.print("enter two numbers");
		int sub=sc2.nextInt();
		System.out.print("enter two numbers");
		int sub2=sc2.nextInt();
		Calculator.sub(sub, sub2);
		Scanner sc3=new Scanner(System.in);
		System.out.print("enter two numbers");
		int mul=sc3.nextInt();
		System.out.print("enter two numbers");
		int mul2=sc3.nextInt();
		Calculator.mul(mul, mul2);
		Scanner sc4=new Scanner(System.in);
		System.out.print("enter two numbers");
		int div=sc4.nextInt();
		System.out.print("enter two numbers");
		int div2=sc4.nextInt();
		Calculator.div(div, div2);
        sc.close();
        sc2.close();
        sc3.close();
        sc4.close();
	}

}
