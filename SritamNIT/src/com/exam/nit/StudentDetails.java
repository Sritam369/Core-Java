package com.exam.nit;

public class StudentDetails {
private String name;
private int age;
public StudentDetails(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public StudentDetails(StudentDetails s) {
	this.name=s.name;
	this.age=s.age;
}

public void update(String name,int age) {
	this.name=name;
	this.age=age;
}

@Override
public String toString() {
	return "StudentDetails [name=" + name + ", age=" + age + "]";
}

}
