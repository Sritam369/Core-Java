package com.sri.string;

import java.util.Scanner;

public class SortingOfString {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string:");
	     String str = sc.nextLine();
	     char s[]=str.toCharArray();
	     for(int i=0;i<s.length;i++) {
	    	 for(int j=i+1;j<s.length;j++) {
	    		 if(s[i]>s[j]) {
	    			 char t = s[i];
	    			 s[i]=s[j];
	    			 s[j]=t;
	    		 }
	    	 }
	     }
       System.out.println(new String(s));
       sc.close();
	}

}
