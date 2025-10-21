package com.sri.oop;

public class Customer {
private double balance=10000;

public void deposit(double amount) {
	if(amount<=0) {
		System.err.println("invalid amount");
		System.exit(0);
	}
	balance=balance+amount;
	
}
public void withdraw(double amount) {
	if(amount>balance) {
		System.err.println("insufficient balance");
		System.exit(0);
	}
	balance=balance-amount;
	
}
public double checkBalance() {
	return balance;
}
}