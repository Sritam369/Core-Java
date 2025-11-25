package com.sri.string;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string:");
	     String str = sc.nextLine();
	     System.out.println("Enter a char:");
	     char ch = sc.nextLine().charAt(0);
	     StringBuilder result = new StringBuilder();
	     for(int i=0;i<str.length();i++) {
	    	 if(str.charAt(i)!=ch) {
	    		 result.append(str.charAt(i));
	    	 }
	     }
	     System.out.println(result);
	     sc.close();
	}

}
