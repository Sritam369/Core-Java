package com.sri.interface_programs;

interface Vehicle{
	void run();
}

public class InterfaceWithAnonymousClass {
	public static void main(String[] args) {
		Vehicle car = new Vehicle() {
			public void run() {
				System.out.println("car is running");
			}
    };
    car.run();
}
}