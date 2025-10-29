package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
public static int[] merge(int arr[],int brr[]) {
	int crr[]=new int [arr.length+brr.length];
	int x = 0;
	for(int i=0;i<arr.length;i++) {
		crr[x++] = arr[i];
	}
	for(int i=0;i<brr.length;i++) {
		crr[x++] = brr[i];
	}
	return crr;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size");
	int s = sc.nextInt();
	System.out.println("enter "+s+" no of int");
	int arr[]=new int[s];
	for(int i = 0 ; i<s;i++) {
		 arr[i]=sc.nextInt();
	}
	System.out.println("enter size");
	int s2 = sc.nextInt();
	System.out.println("enter "+s2+" no of int");
	int brr[]=new int[s2];
	for(int i = 0 ; i<s2;i++) {
		 brr[i]=sc.nextInt();
	}
	int merge[] = merge(arr,brr);
	System.out.println(Arrays.toString(merge));
	sc.close();
}

}
