package com.sri.string;

import java.util.Scanner;

public class CheckUpperCaseOrLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int upper=0;int lower=0;
		boolean upperCase=false;
		boolean lowerCase=false;
		boolean digit=false;
		for(int i=0;i<=str.length()-1;i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper++;
				upperCase=true;
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				lower++;
				lowerCase=true;
			}
			else {
				digit=true;
			}
		}
         if(upperCase == false && lowerCase==false) {
        	 System.out.println("No alphabets found");
         }
         else {
        	 System.out.println("lowercase "+lower);
        	 System.out.println("uppercase "+upper);
         }
         sc.close();
	}

}
