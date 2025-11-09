package com.sri.inheritance;

class Super{
	public Super(String str) {
		super();
		System.out.println("institute name is: "+str);
	}
}
class Sub extends Super{
	public Sub(String name) {
		super(name);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		new Sub("Nit");

	}

}
