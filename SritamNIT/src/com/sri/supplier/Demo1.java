package com.sri.supplier;

import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> 12+12+"java"+40+40;
		System.out.println(s1.get());

	}

}
