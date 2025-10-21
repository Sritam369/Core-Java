package com.sri.blc_constructor;

public class Dog {
private String name;
private String color;
private int age;
private double height;
public Dog(String name,String color,int age,double height) {
	this.name=name;
	this.color=color;
	this.age=age;
	this.height=height;
}

public String toString() {
	return "Dog [name=" + name + ", color=" + color + ", age=" + age + ", height=" + height + "]";
}

}
