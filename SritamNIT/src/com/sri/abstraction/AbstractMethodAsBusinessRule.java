package com.sri.abstraction;

abstract class Animal{
	public abstract void checkup();
}
class Lion extends Animal{
	public void checkup() {
		System.out.println("Lion is going to checkup");
	}
}
class Bird extends Animal{
	public void checkup() {
		System.out.println("Bird is going to checkup");
	}
}
class Dog extends Animal{
	public void checkup() {
		System.out.println("Dog is going to checkup");
	}
}
class Monkey extends Animal{
	public void checkup() {
		System.out.println("Monkey is going to checkup");
	}
}
class Tiger extends Animal{
	public void checkup() {
		System.out.println("Tiger is going to checkup");
	}
}

public class AbstractMethodAsBusinessRule {

	public static void main(String[] args) {
		Lion lion[]= {new Lion(),new Lion(),new Lion()};
		Bird bird[]=new Bird[2];
		bird[0]=new Bird();
		bird[1]=new Bird();
		Dog dog[]=new Dog[] {new Dog(),new Dog()};
		Monkey monkey = new Monkey();
		Tiger tiger = new Tiger();
		AnimalCheckupHospital(monkey,tiger);
		AnimalCheckupHospital(lion);
		AnimalCheckupHospital(bird);
		AnimalCheckupHospital(dog);

	}
	public static void AnimalCheckupHospital(Animal ...a) {
		for(Animal animal : a) {
			animal.checkup();
		}
	}

}
