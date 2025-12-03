package com.sri.method_overriding;

class Vehicle{
	public int tankCapacity() {
		return 80;
	}
	public void printCapacity() {
		System.out.println(tankCapacity());
	}
}
class Car extends Vehicle{
	public int tankCapacity() {
		return 40;
	}
	public void printCapacity() {
		System.out.println(super.tankCapacity());
	}
}

public class VehicleWithVariableHiding {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.printCapacity();

	}

}
