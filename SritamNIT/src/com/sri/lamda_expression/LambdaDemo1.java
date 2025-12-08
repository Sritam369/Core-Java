package com.sri.lamda_expression;

interface Vehicle{
	void run();
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		Vehicle car = () -> System.out.println("car is running");
		Vehicle bike = () -> System.out.println("bike is running");
		car.run();
		bike.run();
	}

}
