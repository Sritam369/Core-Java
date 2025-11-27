package com.sri.var_args;

class Test1{
	public void input(Object... x) {
		for(Object y:x) {
			System.out.println(y);
		}
	}
}

public class Heterogenous {

	public static void main(String[] args) {
		new Test1().input(1,2.3,'A',false,"nit",new StringBuilder("java"));

	}

}
