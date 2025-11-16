package com.sri.inheritance;

class A
{
	protected int x = 100;
}

class B extends A
{
	protected int x = 200;   //Variable Hiding
	
	public static void access()
	{
		B b1 = new B();
		System.out.println(b1.x);
		
		A a1 = b1;
		System.out.println(a1.x);
		
	}
}

public class IQ1 {

	public static void main(String[] args) 
	{
		B.access();
	}

}
