package com.sri.basic;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int num = sc.nextInt();
		int s=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				s+=i;
			}
		}
        if(s==num) {
        	System.out.println("perfect");
        }
        else {
        	System.out.println("not");
        }
        sc.close();
	}

}
