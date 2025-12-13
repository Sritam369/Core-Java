package com.sri.interface_programs;

interface Calculate{
    static double doSum(int x, int y) {
		return x+y;
	}
	static double getCube(int x) {
		return x*x*x;
	}
}
class Myclass implements Calculate{
	static double doSum(int x, int y) {
		System.out.println("class static method");
		return x+y;		
	} 
}

public class InterfaceStaticMethod {

	public static void main(String[] args) {
		System.out.println(Calculate.doSum(5,10));
		System.out.println(Calculate.getCube(5));
        System.out.println(Myclass.doSum(5, 10));
	}

}
