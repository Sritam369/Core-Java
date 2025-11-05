package com.sri.inheritance;

class Vehicle{
	protected int numberOfEngine=1;
	public void start() {
		System.out.println("Vehicle started");
	}
}
class Car extends Vehicle{
	protected String engineType="Battery";
	public void carInfo() {
		System.out.println("car has engine: "+this.numberOfEngine);
		System.out.println("car has engine type: "+this.engineType);
	}
}



public class SingleLevelInheritance {	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.carInfo();

	}

}
