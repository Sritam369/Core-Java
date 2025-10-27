package com.exam.nit;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter runs");
		int runs=Integer.parseInt(sc.nextLine());
		System.out.println("enter balls");
		int balls=Integer.parseInt(sc.nextLine());
		
		System.out.println("enter innings");
		int innings=Integer.parseInt(sc.nextLine());
		System.out.println("enter times out");
		int out=Integer.parseInt(sc.nextLine());
		PlayerStats p1 = new PlayerStats(name,runs,balls,innings,out);
		System.out.println(p1);
		sc.close();
	}

}
