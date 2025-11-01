package com.sri.array;

import java.util.Scanner;

public class FirstLastSum {

	public static void sum(int brr[]) {
		int last=brr.length-1;
		for(int i=0;i<brr.length;i++) {
			
		}
		System.out.println(brr[0]+last);
	}
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter size");
	 int s = sc.nextInt();
	 int arr[]=new int[s];
	 System.out.println("enter "+s+" no of int");
	 for(int i=0;i<s;i++) {
		 arr[i]=sc.nextInt();
	 }
	 FirstLastSum.sum(arr);
	 sc.close();
	}
   
}
