package com.sri.array;

import java.util.Arrays;

public class FirstNPrimeNumbers {
	public static int[] getPrime(int n) {
		int arr[] = new int[n];
		int x = 0;
		for (int i = 1; x < n; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					c++;
			}
			if (c == 2) {
				arr[x] = i; // [2,3,5,7,11]
				x++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {

		int n = 5;
		int[] prime = getPrime(n); // [2,3,5,7,11]
		System.out.println(Arrays.toString(prime));

	}



}
