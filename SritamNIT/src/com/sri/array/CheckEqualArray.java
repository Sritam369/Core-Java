package com.sri.array;

import java.util.Scanner;

public class CheckEqualArray {

public static void check(int arr[],int brr[]) {
	boolean isEqual=true;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]!=brr[i] || arr.length!=brr.length) {
			
			isEqual=false;
		}
	}
		if(isEqual==false) {
			System.out.println("not equal");
		}
		else {
			System.out.println(" equal");
		}
	}
	

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("enter " + s + " no of int");
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter size");
		int s2 = sc.nextInt();
		int brr[] = new int[s2];
		System.out.println("enter " + s + " no of int");
		for (int i = 0; i < s2; i++) {
			brr[i] = sc.nextInt();
		}
		check(arr,brr);
		sc.close();

	}

}
