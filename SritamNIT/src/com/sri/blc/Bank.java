package com.sri.blc;

public class Bank {
private String customerName;
private int accountNumber;
private double currentBalance;
public static String bankName="SBI";
public static String bankAddress="Pratappur";
public static String ifscCode="SBIN0006412";
public void setCustomerDetails(String name,int acc,double balance) {
	customerName=name;
	accountNumber=acc;
	if(balance<=0) {
		System.err.println("invalid balance");
		System.exit(0);
	}
	else {
		
		currentBalance=balance;
	}
}
public void withdraw(double amount) {
	if(amount<=currentBalance) {
		currentBalance-=amount;
	System.out.println("withdrawl balance is: "+amount);
}
	else {
		System.out.println("insufficient balance");
	}
	}
public void deposit(double amount) {
	if(amount>0) {
		currentBalance+=amount;
		System.out.println("deposit balance is: "+amount);
	}
		else {
			System.out.println("invalid amount");
		}
}
public double getCustomerDetails() {
	return currentBalance;
}
public String displayDetails() {
	return "[Name="+customerName+", acc number="+accountNumber+", balance="+currentBalance+"]";
	
}
}
