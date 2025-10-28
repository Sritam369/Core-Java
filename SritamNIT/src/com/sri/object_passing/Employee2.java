package com.sri.object_passing;

public class Employee2 {
private int id;
private String name;
private double basicSalary;
private double hraPer;
private double daPer;


public Employee2(int id, String name, double basicSalary, double hraPer, double daPer) {
	super();
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
	this.hraPer = hraPer;
	this.daPer = daPer;
}
public double calculateGrossSalary() {
	return this.basicSalary+this.hraPer+this.daPer;
}
}
