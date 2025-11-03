package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

public static void delete(int brr[],int ele) {
	int c=0;
	for(int i=0;i<brr.length;i++) {
		if(brr[i]==ele) {
			c++;
		}
	}
	int crr[]=new int[brr.length-c];
	int x=0;
	for(int i=0;i<brr.length;i++) {
		if(brr[i]!=ele) {
			crr[x++]=brr[i];
		}
	}
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
		System.out.println("enter element to delete");
		int ele=sc.nextInt();
		delete(arr,ele);
        sc.close();
	}

}
