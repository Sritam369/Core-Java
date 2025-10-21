package com.sri.encapsulation;

public class Loan {
private double principal;
private double interest;
private int duration;
public Loan(double principal, double interest, int duration) {
	if(principal<=0 || interest<=0 || duration<=0) {
		System.err.println("error");
	}
	else {
	this.principal = principal;
	this.interest = interest;
	this.duration = duration;
	}
}
public double getPrincipal() {
	return principal;
}
public void setPrincipal(double principal) {
	this.principal = principal;
}
public double getInterest() {
	return interest;
}
public void setInterest(double interest) {
	this.interest = interest;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

public String toString() {
	return "Loan [principal=" + principal + ", interest=" + interest + ", duration=" + duration + "]";
}

}
