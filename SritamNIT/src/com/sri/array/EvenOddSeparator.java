package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSeparator {

	public static void evenOrOdd(int arr[]) {
		
		int e=0,o=0,x=0,y=0;
		for(int i=0;i<arr.length;i++)
		{
//			if(arr[i]%2==0)
//				e++;
//			else
//				o++;
		}
		
		int even[]=new int[arr.length];// [0,2]
		int odd[]=new int[arr.length]; // [1,0,0]
		for(int i=0;i<arr.length;i++) //[1,2,3,4,5]
		{
			if(arr[i]%2==0)
				even[x++]=arr[i];
			else
				odd[y++]=arr[i];
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

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
		EvenOddSeparator.evenOrOdd(arr);
	}

}
