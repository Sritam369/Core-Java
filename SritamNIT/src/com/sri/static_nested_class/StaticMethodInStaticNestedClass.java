package com.sri.static_nested_class;

class Out{
	static int x=15;
	static class Inn{
		static void msg() {
			System.out.println("x value is : "+x);
		}
	}
}

public class StaticMethodInStaticNestedClass {

	public static void main(String[] args) {
		Out.Inn.msg();
	}

}
