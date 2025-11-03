package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingElement {

public static void find(int brr[]) {
	for(int i=0;i<brr.length-1;i++) {
		for(int j=brr[i]+1;j<brr[i+1];j++) {
			System.out.print(j+" ");
		}
	}
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
          Arrays.sort(arr);
          find(arr);
          sc.close();
	}

}
