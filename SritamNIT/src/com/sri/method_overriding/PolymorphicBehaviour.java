package com.sri.method_overriding;

class Animal1 {
	public void sleep() {
		System.out.println("animal is sleeping");
	}
}
class Dog1 extends Animal1 {
	public void sleep() {
		System.out.println("dog is sleeping");
	}
}
class Lion extends Animal1 {
	public void sleep() {
		System.out.println("lion is sleeping");
	}
}

public class PolymorphicBehaviour {

	public static void main(String[] args) {
		Animal1 a ;
		a=new Dog1();
		executeAnimal(a);
		a=new Lion();
		executeAnimal(a);
	}
	
	public static void executeAnimal(Animal1 animal) {
		
		animal.sleep();
	}

}
