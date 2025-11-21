package com.sri.basic;

import java.util.Scanner;

public class Armstrong {

	 public static int power(int base,int exp) {
 	    int res=1;
 	    for(int i=exp;i!=0;i--) {
 	    	res= res*base;
 	    }
 	    return res;
 }
	 
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
			int s = 0;int c=0;
            for(int i=num;i!=0;i/=10) {
            	   c++;
            }
            System.out.println(c);
            for(int i=num;i!=0;i/=10) {
            s+=Armstrong.power(i%10, c);
         }
            
            if(s==num) {
           	 System.out.println("armstrong");
            }
            else {
            	System.out.println("not");
            }
            sc.close();
	}
         
}
