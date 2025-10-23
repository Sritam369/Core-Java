package com.sri.scenario_programs;

import java.util.Scanner;

public class CreditCardApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter credit point");
		int credit=Integer.parseInt(sc.nextLine());
		Customer c1= new Customer(name,credit);
		System.out.println(CardsOnOffer.getOfferedCard(c1));
sc.close();
	}

}
