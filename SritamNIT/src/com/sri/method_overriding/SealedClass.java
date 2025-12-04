package com.sri.method_overriding;

sealed class Bird permits Parrot,Peacock{
	public void fly() {
		System.out.println("generic bird is flying");
	}
}
non-sealed class Parrot extends Bird{
	public void fly() {
		System.out.println("parrot bird is flying");
	}
}
final class Peacock extends Bird{
	public void fly() {
		System.out.println("peacock bird is flying");
	}
}
public class SealedClass {

	public static void main(String[] args) {
		Bird b;
		b = new Parrot(); b.fly();
		b = new Peacock(); b.fly();

	}

}
