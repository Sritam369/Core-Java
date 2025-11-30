package com.sri.method_overriding;



class Animal2 {
	public void sleep() {
		System.out.println("animal is sleeping");
	}
}
class Dog2 extends Animal2 {
	public void sleep() {
		System.out.println("dog is sleeping");
	}
	public void bark() {
		System.out.println("dog is barking.");
	}
}
class Lion1 extends Animal2 {
	public void sleep() {
		System.out.println("lion is sleeping");
	}
	public void roar() {
		System.out.println("lion is roaring");
	}
}

public class PolymorphicWithDowncasting {
	
public static void main(String[] args) {
		Animal2 a;
		a=new Dog2();
		executeAnimal(a);
		
		a=new Lion1();
		executeAnimal(a);
	}
	
	public static void executeAnimal(Animal2 animal) {
		animal.sleep();
		Dog2 dog =(Dog2)animal;
		dog.bark();
		
	}

}

