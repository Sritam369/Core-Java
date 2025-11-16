package com.sri.staticblock;

class Fooo{
	Fooo(){
		System.out.println("no argument constructor");
	}
	{
		System.out.println("nsb");
	}
	static
	{
		System.out.println("sb");
	}
}

public class Foo {

	public static void main(String[] args) {
		System.out.println("main method");

	}

}
