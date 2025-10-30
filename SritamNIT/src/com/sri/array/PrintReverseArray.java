package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintReverseArray {

public static void reverse(int brr[]) {
	for(int i=brr.length-1;i>=0;i--) {
		System.out.print(brr[i]);
	}
}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("enter "+s+" number of integers");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
			
		}
		PrintReverseArray.reverse(arr);
			sc.close();	

	}

}
