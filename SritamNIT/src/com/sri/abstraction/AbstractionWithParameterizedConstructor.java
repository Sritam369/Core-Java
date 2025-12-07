package com.sri.abstraction;

abstract class Vehicle{
	protected String name;
	public Vehicle(String name) {
		this.name=name;
	}
	public abstract void run();
}
class Cars extends Vehicle{
	public Cars(String name) {
		super(name);
	}
	public void run() {
		System.out.println("car is running");
	}
	public String getCarName() {
		return this.name;
	}
}

public class AbstractionWithParameterizedConstructor {

	public static void main(String[] args) {
		Vehicle v = new Cars("bmw"); 
		System.out.println(v.name);
		Cars car = (Cars)v;
		System.out.println(car.getCarName());
		v.run();

	}

}
