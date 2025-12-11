package com.sri.abstraction;

abstract class Car{
	protected int speed=90;

	public Car() {
		System.out.println("car class constructor");
	}
	public void getCarDetails() {
		System.out.println("it has 4 wheels");
	}
	public abstract void run(); // partial abstraction
}
class Honda extends Car{	
	
	public void run() {
		System.out.println("honda car is running");
	}
}

public class AbstractionWithConstructor {

	public static void main(String[] args) {
		Car car = new Honda();
		car.getCarDetails();
		car.run();
		System.out.println(car.speed+" speed");

	}

}
