package com.sri.hasa_relation;

import java.util.Scanner;

class Driver{
	private String name;
	private int age;
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}	
	
}
class Car{
	private String brand;
	private String model;
	private int year;
	private Driver driver;
	public Car(String brand, String model, int year, String name,int age) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = new Driver(name,age);
	}
	public Car(Car car) {
		this.brand = car.brand;
		this.model = car.model;
		this.year = car.year;
	}
	
	public void changeDriver(Driver newDriver) {
		this.driver=newDriver;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver.toString() + "]";
	}
	
}


public class UpdateDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice");
		int choice = Integer.parseInt(sc.nextLine());
		if(choice==1) {
			System.out.println("enter name");
			String name = sc.nextLine();
			System.out.println("enter age");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("enter new name");
			String newname = sc.nextLine();
			System.out.println("enter new age");
			int newage = Integer.parseInt(sc.nextLine());
			System.out.println("enter brand");
			String brand = sc.nextLine();
			System.out.println("enter model");
			String model = sc.nextLine();
			System.out.println("enter year");
			int year = Integer.parseInt(sc.nextLine());
			
			Driver d = new Driver(newname,newage);
			Car c1 = new Car(brand,model,year,name,age);
			Car c2 = new Car(c1);
			System.out.println(c1);
			c2.changeDriver(d);
			System.out.println(c2);
		}
		else {
			System.out.println("enter name");
			String name = sc.nextLine();
			System.out.println("enter age");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("enter brand");
			String brand = sc.nextLine();
			System.out.println("enter model");
			String model = sc.nextLine();
			System.out.println("enter year");
			int year = Integer.parseInt(sc.nextLine());
			
			Driver d = new Driver(name,age);
			Car c1 = new Car(brand,model,year,name,age);
			Car c2 = new Car(c1);
			System.out.println(c1);
			c2.changeDriver(d);
			System.out.println(c2);
			sc.close();
		}

	}

}
