package com.sri.pass_by_value;

public class Manager {
private int managerId;
private String managerName;
private double basicSalary;
private double hraPer;
private double daPer;
private double project;
public Manager(int managerId, String managerName, double basicSalary, double hraPer, double daPer, double project) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.basicSalary = basicSalary;
	this.hraPer = hraPer;
	this.daPer = daPer;
	this.project = project;
}
public double calculateGrossSalary() {
	return this.basicSalary+this.daPer+this.hraPer+this.project;
}
}
