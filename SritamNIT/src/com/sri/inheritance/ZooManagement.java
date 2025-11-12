package com.sri.inheritance;

import java.util.Scanner;

class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Mamal extends Animal{
	private boolean hasFur;

	public Mamal(String name, boolean hasFur) {
		super(name);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
}
class Dog extends Mamal{
	private String breed;
	public Dog(String name,boolean hasFur,String breed) {
		super(name,hasFur);
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [name="+super.getName()+", hasfur= "+super.isHasFur()+", breed=" + breed + "]";
	}	
}

public class ZooManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the type of object to create");
		System.out.println("1.Animal.\n"+"2.Mammal\n"+"3.Dog");
		int num = Integer.parseInt(sc.next());
		
		if(num==1) {
			System.out.println("enter name");
			String name = sc.next();
			Animal a = new Animal(name);
			System.out.println("Animal [getName= "+a.getName()+"]");
			System.exit(0);
		}
		
		else if(num==2) {
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter if mamal has fur or not");
			boolean hasFur = sc.nextBoolean();
			Mamal m = new Mamal(name,hasFur);
			System.out.println("Mamal[ getName= "+m.getName()+", isHasFur= "+m.isHasFur()+"]");
			System.exit(0);
		}
		
		else {
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter if mamal has fur or not");
		boolean hasFur = sc.nextBoolean();
		System.out.println("enter breed");
		String breed = sc.next();
		Dog dog = new Dog(name,hasFur,breed);
		System.out.println(dog);
        sc.close();
		}
	}

}
