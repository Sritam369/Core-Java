package com.sri.staticblock;

class Test1{
	public static final Test1 t1 = new Test1();
	static {
		System.out.println("sb");
	}
	{
		System.out.println("nsb");
	}
	Test1(){
		System.out.println("no arg constructor");
	}
}



public class StaticBlockDemo5 {

	public static void main(String[] args) {
	  new Test1();

	}

}
