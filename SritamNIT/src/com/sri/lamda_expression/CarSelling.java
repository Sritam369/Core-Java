package com.sri.lamda_expression;

import java.util.Scanner;
import java.util.function.Predicate;

record Car(String brand,Double price,Integer mileage) {}

public class CarSelling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter brand");
		String brand = sc.nextLine();
		System.out.println("enter price");
		double price =Double.parseDouble(sc.nextLine());
		System.out.println("enter mileage");
		int mileage =Integer.parseInt(sc.nextLine());
		Car c = new Car(brand,price,mileage);
		Predicate<Car> eligible = carSale -> carSale.price()<=500000.0 && carSale.mileage()>=20;
		boolean isEligible = eligible.test(c);
		if(isEligible) {
			System.out.println(brand+" is eligible for sale");
		}
		else {
			System.out.println(brand+" is not for sale");
		}
		sc.close();
	}

}
