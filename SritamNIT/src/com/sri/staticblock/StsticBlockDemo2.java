package com.sri.staticblock;

class Demo{
	final static int x;
	static {
		m1();
		x=100;
		System.out.println("x value: "+x);
	}
	public static void m1() {
		System.out.println("x value: "+x);
	}
}

public class StsticBlockDemo2 {

	public static void main(String[] args) {
		System.out.println("x value: "+Demo.x);
	}
}
