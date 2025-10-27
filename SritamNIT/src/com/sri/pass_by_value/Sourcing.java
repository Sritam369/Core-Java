package com.sri.pass_by_value;

public class Sourcing {
private int sourceId;
private String sourceName;
private double basicSalary;
private double hraPer;
private double daPer;
private int enrollmentTarget;
private int enrollmentReached;
private double perkPerEnrollment;
public Sourcing(int sourceId, String sourceName, double basicSalary, double hraPer, double daPer, int enrollmentTarget,
		int enrollmentReached, double perkPerEnrollment) {
	super();
	this.sourceId = sourceId;
	this.sourceName = sourceName;
	this.basicSalary = basicSalary;
	this.hraPer = hraPer;
	this.daPer = daPer;
	this.enrollmentTarget = enrollmentTarget;
	this.enrollmentReached = enrollmentReached;
	this.perkPerEnrollment = perkPerEnrollment;
}
public double calculateGrossSalary() {
	return this.basicSalary+this.hraPer+this.daPer+((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment;
}
}
