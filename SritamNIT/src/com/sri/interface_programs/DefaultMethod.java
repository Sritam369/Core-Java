package com.sri.interface_programs;

interface Vehicles{
	void run();
	void horn();
	default void digitalMeter() {
		System.out.println("digital meter coming soon");
	}
}
class Cars implements Vehicles{

	@Override
	public void run() {
		System.out.println("Car is running");	
	}
	@Override
	public void horn() {
		System.out.println("car is honking");	
	}
	public void digitalMeter() {
		System.out.println("car have digital meter");
	}
}
class Bike implements Vehicles{

	@Override
	public void run() {
		System.out.println("Bike is running");	
	}

	@Override
	public void horn() {
		System.out.println("Bike is honking");	
	}
}

public class DefaultMethod {

	public static void main(String[] args) {
		Vehicles v = new Cars();
		v.run();
		v.horn();
		v.digitalMeter();
		Vehicles v2 = new Bike();
		v2.run();
		v2.horn();
		v2.digitalMeter();
}

}
