package com.sri.lamda_expression;

interface Calculate{
	void doSum(int x , int y);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Calculate c = (a,b) -> System.out.println(a+b);
        c.doSum(5,10);
	}

}
