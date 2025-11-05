package com.sri.array;

import java.util.Scanner;

public class FindMaxAndMinElement {

public static void find(int brr[]) {
	int min=brr[0],max=brr[0];
	for(int i=0;i<brr.length;i++) {
		
		if(brr[i]<min) {
			min=brr[i];
		}
		if(brr[i]>max) {
			max=brr[i];
		}
	}
	System.out.println("min: "+min);
	System.out.println("max: "+max);
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
         find(arr);
         sc.close();
	}

}
