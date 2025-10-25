package com.exam.nit;

public class BankAccount {
private String accountHolderName;
private double principal;
private double time;
private double interestRate;
private double finalAmount;

public BankAccount(String accountHolderName, double principal, double time) {
	super();
	this.accountHolderName = accountHolderName;
	this.principal = principal;
	this.time = time;
}

public BankAccount(BankAccount b) {
	super();
	this.accountHolderName = b.accountHolderName;
	this.principal = b.principal;
	this.time = b.time;
	this.finalAmount=b.getFinalAmount();
}

public double calculateInterest(double time) {
	double interest;
	if(time<=1) {
		this.interestRate=20.0;
		interest=(this.principal*this.interestRate*time)/100;
	}
	else if(time>1 && time <=1.5) {
		this.interestRate=22.0;
		interest=(this.principal*this.interestRate*time)/100;
	}
	else  {
		this.interestRate=25.0;
		interest=(this.principal*this.interestRate*time)/100;
	}
	return interest;
}

public double getFinalAmount() {
	return this.principal+this.calculateInterest(time);
}

@Override
public String toString() {
	return "BankAccount [accountHolderName=" + accountHolderName + ", principal=" + principal + ", time=" + time
			+ ", interestRate=" + interestRate + ", interest="+calculateInterest(time)+" finalAmount=" + getFinalAmount() + "]";
}

}
