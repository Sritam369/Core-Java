package com.sri.var_args;

class Demo{
	public void input(int... x) {
		for(int i=0;i<=x.length-1;i++) {
		System.out.println("executed "+x[i]);
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.input(5);
		d.input(5,10);
		d.input();

	}

}
