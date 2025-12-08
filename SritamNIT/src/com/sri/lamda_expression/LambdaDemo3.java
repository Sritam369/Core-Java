package com.sri.lamda_expression;

interface Length{
	int getLength(String str);
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		Length l = str -> str.length();
        System.out.println(l.getLength("hello"));
	}

}
