package com.sri.interface_programs;

interface A{
	default void m() {
		System.out.println("alpha interface");
	}
}
interface B {
	default void m() {
		System.out.println("beta interface");
	}
}
class C implements A,B{
	public void m() {
		A.super.m();
		B.super.m();
		System.out.println("MI is possible");
	}
}

public class MultipleInheritanceWithDefaultMethod {

	public static void main(String[] args) {
		A a = new C();
		a.m();

	}

}
