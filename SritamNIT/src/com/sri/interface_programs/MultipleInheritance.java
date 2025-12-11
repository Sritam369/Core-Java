package com.sri.interface_programs;

interface Alpha{
	void m1(); // by deafult public abstract
}
interface Beta {
	void m1();
}
class Implementer implements Alpha,Beta{
	
	public void m1() {
		System.out.println("mi is possible");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Alpha a = new Implementer();
		a.m1();
	}

}
