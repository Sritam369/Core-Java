package com.sri.composition;

public class Car {
private String name;
private int model;
private final Engine engine ;
public Car(String name, int model) {
	super();
	this.name = name;
	this.model = model;
	this.engine = new Engine("petrol",2500);
}
@Override
public String toString() {
	return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
}
}

