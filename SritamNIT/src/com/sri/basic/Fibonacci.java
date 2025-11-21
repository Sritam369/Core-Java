package com.sri.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int num = sc.nextInt();
		int f1 = 0,f2=1;
		System.out.print(""+f1+" "+f2+"");
        for(int i=2;i<=num;i++) {
        	int next = f1+f2;
        	System.out.print(" "+next+" ");
        	f1=f2;
        	f2=next;
        }
        sc.close();
	}

}
