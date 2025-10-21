package com.sri.blc_constructor;

public class Car {
private String model;
private int year;
private double price;

public Car(String model, int year, double price) {
	
	this.model = model;
	if(year>=2010) {
	this.year = year;
	}
	else {
		System.err.println("year must be greater than 2010");
		System.exit(0);
	}
	if(price>0) {
	this.price = price;
	}
	else {
		System.err.println("price must be positive integer");
		System.exit(0);
	}
}


public String toString() {
	return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
}

}
