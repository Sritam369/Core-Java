package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.Hotel;
public class HotelBookingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter name");
		String name=sc.nextLine();
		System.out.print("enter hotel name");
		String hotelName=sc.nextLine();
		System.out.print("enter room rate");
		int rent=Integer.parseInt(sc.nextLine());
		System.out.print("enter no of days");
		int day=Integer.parseInt(sc.nextLine());
		System.out.println("----Hotel Booking App----");
		System.out.println("customer name is "+name);
		System.out.println("hotel name is "+hotelName);
        double total = Hotel.calculateTotalAmount(rent, day);
        Hotel.calculateDiscountedAmount(day, total);
        sc.close();
	}

}
