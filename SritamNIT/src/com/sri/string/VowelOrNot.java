package com.sri.string;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();
	        str=str.toLowerCase();
	        boolean isVowel=false;
	        for(int i=0;i<str.length();i++) {
	        	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
	        		isVowel=true;
	        		
	        	}
	        	if(Character.isDigit(str.charAt(i))) {
        			System.out.println("contains digits");
        			return;
        		}
	        }
	        if(isVowel==true) {
	        	System.out.println("contains vowels");
	        }
	        else {
	        	System.out.println("doesn't contain vowel");
	        }
sc.close();
	}

}
