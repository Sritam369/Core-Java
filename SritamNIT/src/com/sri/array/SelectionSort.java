package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

public static void sortArray(int brr[]) {	
	for(int i=0;i<brr.length;i++) {
		for(int j=i+1;j<brr.length;j++) {
			if(brr[i]>brr[j] ){
				int t=brr[i];
				brr[i]=brr[j];
				brr[j]=t;
			}
		}
	}
}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size");
	int s = sc.nextInt();
	System.out.println("enter "+s+" number of integers");
    int arr[]=new int[s];
    for(int i=0;i<s;i++) {
    	arr[i]=sc.nextInt();
    }
      SelectionSort.sortArray(arr);
      System.out.println(Arrays.toString(arr));
      sc.close();
	}

}
