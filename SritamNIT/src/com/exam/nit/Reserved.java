package com.exam.nit;

import java.util.Scanner;

public class Reserved {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter seats");
		int seats = Integer.parseInt(sc.nextLine());
		System.out.println("enter days");
		int days = Integer.parseInt(sc.nextLine());
		System.out.println(Reservation.res(name, seats, days));
 sc.close();
	} 

}
