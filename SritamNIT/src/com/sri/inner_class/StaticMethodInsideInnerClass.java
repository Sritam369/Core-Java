package com.sri.inner_class;

class Outer4{
	private static int x = 100;
	class Inner{
		public static void m() {	
			System.out.println("outer x : "+x);
		}
	}
}
public class StaticMethodInsideInnerClass {

	public static void main(String[] args) {
		Outer4.Inner.m();

	}

}
