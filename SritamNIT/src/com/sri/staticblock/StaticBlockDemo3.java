package com.sri.staticblock;

class A{
	static {
		System.out.println("a");
	}
	{
		System.out.println("b");
	}
	A(){
		System.out.println("c");
	}
}
class B extends A{
	static {
		System.out.println("d");
	}
	{
		System.out.println("e");
	}
	B(){
		System.out.println("f");
	}
}

public class StaticBlockDemo3 {

	public static void main(String[] args) {
		new B();

	}

}
