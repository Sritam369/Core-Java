package com.sri.array;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter size");
	   int size = sc.nextInt();
	   System.out.println("enter "+size+" number of integers");
	   int arr[] = new int[size];
	   for (int i =0; i<size;i++) {
		   arr[i] = sc.nextInt();
	   }
	   for(int i=0;i<arr.length;i++) {
		   int c=0;
		   for(int j=1;j<=arr[i];j++) {
			   if(arr[i]%j==0) {
				   c++;
			   }
		   }
		   if(c==2) {
			  System.out.println(arr[i]); 
		   }
	   }
	   
	   sc.close();
	}

}
