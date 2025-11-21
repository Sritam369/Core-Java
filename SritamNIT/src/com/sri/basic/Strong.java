package com.sri.basic;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int num = sc.nextInt();
		int sum=0;
		for(int i=num;i!=0;i/=10) {
			int fact=1;
			for(int j=i%10;j>=1;j--) {
			fact=fact*j;
			
			}
			sum=sum+fact;
		}
		System.out.println(sum);
        if(sum==num) {
        	System.out.println("strong");
        }
        else {
        	System.out.println("not");
        }
        sc.close();
	}

}
