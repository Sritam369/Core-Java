package com.sri.copy_constructor;

public class Data {

	public static void main(String[] args) {
		Employee e1= new Employee(101,"scott");
		Manager m1=new Manager(e1);
		System.out.println(e1);
		System.out.println(m1);
	}

}
