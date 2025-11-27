package com.sri.method_overloading;

class Alpha{
	public void accept(int x) {
		System.out.println("int x value is "+x);
	}
	public void accept(long x) {
		System.out.println("long x value is "+x);
	}
}
class Beta extends Alpha{
	public void accept(float x) {
		System.out.println("float x value is "+x);
	}
	 double accept(double x) {
		System.out.println("double x value is "+x);
		return x;
	}
}


public class Demo {

	public static void main(String[] args) {
		Beta beta = new Beta();
		beta.accept(20);

	}

}
