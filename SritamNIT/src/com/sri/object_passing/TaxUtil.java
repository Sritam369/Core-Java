package com.sri.object_passing;

public class TaxUtil {

	public double calculateTax(Employee2 e) {
		if(e.calculateGrossSalary()>50000) {
			return e.calculateGrossSalary()*20/100;
		}
		else {
			return e.calculateGrossSalary()*5/100;
		}
	}
	
	public double calculateTax(Manager m) {
		if(m.calculateGrossSalary()>50000) {
			return m.calculateGrossSalary()*20/100;
		}
		else {
			return m.calculateGrossSalary()*5/100;
		}
	}
	
	public double calculateTax(Trainer t) {
		if(t.calculateGrossSalary()>50000) {
			return t.calculateGrossSalary()*20/100;
		}
		else {
			return t.calculateGrossSalary()*5/100;
		}
	}
	
	public double calculateTax(Sourcing s) {
		if(s.calculateGrossSalary()>50000) {
			return s.calculateGrossSalary()*20/100;
		}
		else {
			return s.calculateGrossSalary()*5/100;
		}
	}
}
