package com.sri.method_overriding;

class Animals{
	public void eat() {
		System.out.println("generic eating");
	}
}
class Dogs extends Animals{
	public void eat() {
		System.out.println("dog is eating");
	}
	public void bark() {
		System.out.println("dog is barking");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		Animals animal = new Dogs(); // upcasting
		Dogs dog = (Dogs)animal; // downcasting
		dog.bark();
		dog.eat();
		animal.eat();
	}

}
