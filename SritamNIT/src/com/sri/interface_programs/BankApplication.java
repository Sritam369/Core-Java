package com.sri.interface_programs;

interface Bank{
	
	void deposit(double amount);
	void withdraw(double amount);
}
class SBI implements Bank{
	protected double balance = 10000;
	public void deposit(double amount) {
		if(amount<=0) {
			System.err.println("amount can't be negative");
			System.exit(0);
		}
		else {
			this.balance = this.balance+amount;
			System.out.println("amount after deposit : "+balance);
		}
	}
	public void withdraw(double amount) {
		
		if(amount>balance) {
			System.err.println("insufficient balance");
			System.exit(0);
		}
		else {
			this.balance = this.balance-amount;
			System.out.println("amount after withdraw : "+balance);
		}
	}
}

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new SBI();
		bank.deposit(5000);
		bank.withdraw(2000);

	}

}
