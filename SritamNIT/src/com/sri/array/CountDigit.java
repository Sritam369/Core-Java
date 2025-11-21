package com.sri.array;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();
		System.out.println("enter "+s+" no of int");
		int arr[]=new int[s];
		for(int i = 0 ; i<s;i++) {
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++) {
			int n=arr[i];
			int c=0;
			for(int j=n;j!=0;j/=10) {
				c++;			
			}
			System.out.println(arr[i]+"="+c);
		}
		sc.close();
	}

}
