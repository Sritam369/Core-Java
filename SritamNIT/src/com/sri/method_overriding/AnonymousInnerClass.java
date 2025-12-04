package com.sri.method_overriding;

abstract class Vehicle6{
	public abstract void run();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Vehicle6 car = new Vehicle6() {
			public void run() {
				System.out.println("car is running");
			}
		};
		
		Vehicle6 bike = new Vehicle6() {
			public void run() {
				System.out.println("bike is ruuning");
			}
		};
		car.run();
		bike.run();

	}

}
