package com.sri.interface_programs;

sealed interface Moveable {
	int SPEED = 100; // by default public static final
	void move();
}

non-sealed class Car implements Moveable{ // sub class must write final / non-sealed/sealed
	public void move() {
		
		System.out.println("car speed is : "+SPEED);
	}
}

public class InterfaceOverriding {

	public static void main(String[] args) {
		
		Moveable m = new Car();
		m.move();
		System.out.println("speeed of the car is : "+Moveable.SPEED);

	}

}
