package com.sri.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a string");
	String str = sc.next();
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
			System.out.println("not palindrome");
			return;
		}
	}
       System.out.println("palindrome");
       sc.close();
	}

}
