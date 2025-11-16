package com.sri.staticblock;

class Sample{
	static {
		System.out.println("static block");
		x=m1();
		System.out.println("x value: "+Sample.x);
	}
	public static int m1() {
		System.out.println("static method");
		return 100;
	}
	static int x;
}

public class StaticBlockDemo6 {

	public static void main(String[] args) {
		 System.out.println("x value: "+Sample.x);
	}

}
