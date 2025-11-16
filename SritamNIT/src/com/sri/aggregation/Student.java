package com.sri.aggregation;

public class Student {
private int id;
private String name;
private String address;
private College college;
public Student(int id, String name, String address, College college) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.college = college;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", college=" + college + "]";
}

}
