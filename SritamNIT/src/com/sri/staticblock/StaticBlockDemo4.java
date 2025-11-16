package com.sri.staticblock;

class Demo1{
	static {
		i=100;
	}
	static int i;
}


public class StaticBlockDemo4 {

	public static void main(String[] args) {
		System.out.println(Demo1.i);

	}

}
