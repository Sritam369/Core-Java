package com.sri.abstraction;

abstract class Alpha{
	public abstract void show();
	public abstract void demo();
}
abstract class Beta extends Alpha{
	public void show() {
		System.out.println("show method is overriden in beta class");
	}
	// here demo() is not overriden so beta class became abstract class and demo() is available in beta class as an abstract method.
}
class Gamma extends Beta{
	
	public void demo() {
	  System.out.println("demo method is overriden in gamma class");
	}
}

public class AbstractMethodOverriding {

	public static void main(String[] args) {
		Gamma g = new Gamma();
		g.demo();
		g.show();

	}

}
