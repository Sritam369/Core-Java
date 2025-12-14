package com.sri.inner_class;

class Outer3{
	private int x = 100;
	class Inner{
		int x = 200;
		public void m() {
			System.out.println("inner x : "+this.x);
			System.out.println("outer x : "+Outer3.this.x);
		}
	}
}

public class VariableShadow {

	public static void main(String[] args) {
		Outer3.Inner in = new Outer3().new Inner();
		in.m();
	}

}
