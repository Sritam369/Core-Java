package com.sri.method_overriding;

class Animal{
	public void eat() {
		System.out.println("generic eating");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Animal animal = new Dog(); // upcasting
		animal.eat();

	}

}
