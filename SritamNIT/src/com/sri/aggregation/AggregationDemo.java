package com.sri.aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		College clg = new College("vit","vellore");
		
        Student s1 = new Student(1,"scott","hyd",clg);
        System.out.println(s1);
        Student s2 = new Student(2,"james","hyd",clg);
        System.out.println(s2);
	}

}
