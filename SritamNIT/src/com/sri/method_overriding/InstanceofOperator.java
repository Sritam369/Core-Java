package com.sri.method_overriding;

class Animal3 {
	public void sleep() {
		System.out.println("animal is sleeping");
	}
}
class Dog3 extends Animal3 {
	public void sleep() {
		System.out.println("dog is sleeping");
	}
	public void bark() {
		System.out.println("dog is barking.");
	}
}
class Lion2 extends Animal3 {
	public void sleep() {
		System.out.println("lion is sleeping");
	}
	public void roar() {
		System.out.println("lion is roaring");
	}
}

public class InstanceofOperator {
	
public static void main(String[] args) {
		Animal3 a;
		a=new Dog3();
		executeAnimal(a);
		
		a=new Lion2();
		executeAnimal(a);
	}
	
	public static void executeAnimal(Animal3 animal) {
		
		if(animal instanceof Dog3 ) 
		{
			Dog3 dog = (Dog3)animal;
			dog.sleep();
			dog.bark();
		}
		else if(animal instanceof Lion2 lion) {  // 16v
			lion.sleep();
			lion.roar();
		}
	}

}


