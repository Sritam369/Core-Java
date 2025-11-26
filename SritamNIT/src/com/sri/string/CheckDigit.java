package com.sri.string;

import java.util.Scanner;

public class CheckDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean hasDigit=false;
		System.out.println("enter a string");
		String str = sc.next();
		for(int i=0;i<=str.length()-1;i++) {
			if(Character.isDigit(str.charAt(i))) {
				hasDigit=true;
				break;
			}
		}
       if(hasDigit==true) {
    	   System.out.println("it has digit");
       }
       else {
    	   System.out.println("it doesn't have any digit");
       }
       sc.close();
	}

}
