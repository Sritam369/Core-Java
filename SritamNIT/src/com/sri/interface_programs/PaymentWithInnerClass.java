package com.sri.interface_programs;

interface Payable{
	void pay();
}


public class PaymentWithInnerClass {

	public static void main(String[] args) {
		Payable employee = new Payable() {
			public void pay() {
				System.out.println("employee inner class pay method");
			}
		};
		Payable contractor = new Payable() {
			public void pay() {
				System.out.println("contractor inner class pay method");
			}
		};
		employee.pay();
		contractor.pay();
	}

}
