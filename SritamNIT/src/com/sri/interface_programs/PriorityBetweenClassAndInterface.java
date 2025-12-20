package com.sri.interface_programs;

import java.lang.classfile.Superclass;

interface X{
	int x =100;
	default void show() {
		System.out.println("default method");
	}
}
class Y{
	int x = 200;
	public void show() {
		System.out.println("concrete method");
	}
}
class Z extends Y implements X{
	int x = 300; // variable hiding otherwise ambiguity issue between X interface variable and Y class variable
	public void display() {
		System.out.println(x);
	}
}

public class PriorityBetweenClassAndInterface {

	public static void main(String[] args) {
		Z z = new Z();
		z.show();
		z.display();

	}

}
