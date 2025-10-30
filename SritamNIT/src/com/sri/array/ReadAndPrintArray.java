package com.sri.array;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ReadAndPrintArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int s = sc.nextInt();
		System.out.println("enter "+s+" number of integers");
		int arr[] = new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
			sc.close();	

	}

}
