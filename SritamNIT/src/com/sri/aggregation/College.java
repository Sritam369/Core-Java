package com.sri.aggregation;

public class College {
private String name;
private 	String location;
public College(String name, String location) {
	super();
	this.name = name;
	this.location = location;
}
@Override
public String toString() {
	return "College [name=" + name + ", location=" + location + "]";
}

}
