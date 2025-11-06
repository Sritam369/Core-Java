package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {

public static void remove(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=-1;
			}
		}		
		}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=-1)
		System.out.println(arr[i]);
	}
}
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		   System.out.println("enter size");
		   int size = sc.nextInt();
		   System.out.println("enter "+size+" number of integers");
		   int arr[] = new int[size];
		   for (int i =0; i<size;i++) {
			   arr[i] = sc.nextInt();
		   }
		   remove(arr);
	}

}
