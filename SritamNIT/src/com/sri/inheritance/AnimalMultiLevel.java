package com.sri.inheritance;

class Animals{
	public void eat() {
		System.out.println("animal is eating");
	}
}
class Mamals extends Animals{
	public void walk() {
		System.out.println("mamal is walking");
	}
}
class Dogs extends Mamals{
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class AnimalMultiLevel {

	public static void main(String[] args) {
	Dogs dog = new Dogs();
	dog.bark();
	dog.eat();
	dog.walk();
	}

}
