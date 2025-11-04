package com.sri.array;

import java.util.Scanner;

public class LeaderElement {

	public static void findLeader(int arr[]) {
	    
	    for (int i = 0; i < arr.length; i++) {
	        boolean isLeader = true;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] < arr[j]) {
	                isLeader = false;
	                break;
	            }
	        }
	        if (isLeader) {
	            System.out.println(arr[i]);
	        }
	    }
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
        findLeader(arr);
        sc.close();
	}

}
