package com.sri.exception_handling;

import java.util.Scanner;

public class ArrayStoreExample {
	void main() {
		storeObjects();
	}

	public static void storeObjects() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		Object arr[]=new String[size];

		try(sc) {
			for (int i = 0; i < 5; i++) {
				System.out.println("enter value");
				String s = sc.nextLine();
				if (s.matches("\\d+")) {
					arr[i] = Integer.parseInt(s);
				} else {
					arr[i] = s;
				}
			}
			IO.println("Objects stored successfully");
		} catch (ArrayStoreException e) {
			IO.println(e);
		}

	}
}