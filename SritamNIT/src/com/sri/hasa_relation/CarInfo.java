package com.sri.hasa_relation;

import java.util.Scanner;

class Engine {
  private String model;
  private int engineCapacity;
  public Engine(String model, int engineCapacity) {
	super();
	this.model = model;
	this.engineCapacity = engineCapacity;
  }
  @Override
  public String toString() {
	return "Engine [model=" + model + ", engineCapacity=" + engineCapacity + "]";
  }
  
}

class Car{
	private String make;
	private String model2;
	private int year; 	
	private final Engine engine;
	public Car(String make, String model2, int year,String model, int engineCapacity ) {
		super();
		this.make = make;
		this.model2 = model2;
		this.year = year;
		this.engine = new Engine(model,engineCapacity);
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model2 + ", year=" + year + ", engine=" + engine.toString() + "]";
	} 
}

public class CarInfo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter model");
		String model = sc.nextLine();
		System.out.println("enter engine capacity");
		int cap = Integer.parseInt(sc.nextLine());
		System.out.println("enter make");
		String make = sc.nextLine();
		System.out.println("enter model2");
		String model2 = sc.nextLine();
		System.out.println("enter year");
		int year = Integer.parseInt(sc.nextLine());
		Car c = new Car(make,model2,year,model,cap);
		System.out.println(c);
		sc.close();
	}
}