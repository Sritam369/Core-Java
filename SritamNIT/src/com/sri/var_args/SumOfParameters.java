package com.sri.var_args;

class Addition{
	public void sum(int... values) {
		int s = 0;
		for(int value : values) {
			s+=value;
		}
		System.out.println(s);
	}
}

public class SumOfParameters {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.sum(1,2,3,4,5);
		add.sum(1,2);
	}

}
