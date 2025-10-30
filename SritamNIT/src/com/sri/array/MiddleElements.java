package com.sri.array;

import java.util.Scanner;

public class MiddleElements {

public static void middle(int brr[]) {
	if(brr.length%2!=0) {
		for(int i=0;i<brr.length;i++) {
			
		}
		int c=(brr.length/2)+1;
		System.out.println(c);
	}
		else {
			for(int i=0;i<brr.length;i++) {
				
			}
			int c=(brr.length/2);
			int d=(brr.length/2)+1;
			System.out.println(c);
			System.out.println(d);
		}
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
		 MiddleElements.middle(arr);
		 sc.close();
	}

}
