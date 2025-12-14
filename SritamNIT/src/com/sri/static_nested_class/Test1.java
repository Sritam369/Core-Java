package com.sri.static_nested_class;

class Outer{
	static class Inner{
		void go() {
			System.out.println("bhag milkha bhag");
		}
	}
}

public class Test1 {

	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner();
		in.go();

	}

}
