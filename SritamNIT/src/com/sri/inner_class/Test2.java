package com.sri.inner_class;

class Myouter{
	private int x =7;
	public void makeInner() {
		Inner in = new Inner();
		System.out.println("inner y is "+in.y);
		in.seeOuter();
	}
	class Inner{
		private int y=15;
		public void seeOuter() {
			System.out.println("outer x is : "+x);
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		Myouter in =new Myouter();
		in.makeInner();

	}

}
