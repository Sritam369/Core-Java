package com.sri.pass_by_value;

public class Customer {
private double bill;
public Customer(double bill) {
	this.bill=bill;
}
public double getBill() {
	return bill;
}
public void setBill(double bill) {
	this.bill = bill;
}
@Override
public String toString() {
	return "Customer [bill=" + bill + "]";
}

}
