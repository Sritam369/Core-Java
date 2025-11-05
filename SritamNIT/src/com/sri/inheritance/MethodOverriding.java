package com.sri.inheritance;

class Alpha{
	public void show() {
		System.out.println("Alpha class show method");
	}
}
class Beta extends Alpha{
	public void show() {
		super.show();
		System.out.println("Beta class show method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Beta beta=new Beta();
		beta.show();

	}

}
