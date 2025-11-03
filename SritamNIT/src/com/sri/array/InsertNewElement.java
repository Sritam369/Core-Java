package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNewElement {

public static void insert(int brr[],int ele) {
	int crr[]=new int[brr.length+1];
	for(int i=0;i<brr.length;i++) {
		crr[i]=brr[i];
	}
	crr[crr.length-1]=ele;
	System.out.println(Arrays.toString(crr));
}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();
		
		int arr[]=new int[s];
		System.out.println("enter elements");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to insert");
         int ele=sc.nextInt();
         insert(arr,ele);
         sc.close();
	}

}
