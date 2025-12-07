package com.sri.interface_programs;

interface Alpha2{
	void m1();
}
interface Beta2 extends Alpha2 {
	void m2();
}
class Implementer2 implements Beta2{
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
	}
}

public class ExtendingInterface {

	public static void main(String[] args) {
		Implementer2 a = new Implementer2();
		a.m1();
		a.m2();

	}

}
