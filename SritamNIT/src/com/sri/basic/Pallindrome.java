package com.sri.basic;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int a = 0;
		for(int i=num;i!=0;i/=10) {
			a=a*10+i%10;
		}
if(num==a) {
	System.out.println("pal");
}
else {
	System.out.println("not");
}
sc.close();
	}

}
