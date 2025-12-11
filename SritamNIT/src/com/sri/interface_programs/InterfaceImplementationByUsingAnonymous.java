package com.sri.interface_programs;

interface Printer{
	void print();
}
class PrinterDemo{
	public Printer getPrinter() {
		Printer p = new Printer() {
			public void print() {
				System.out.println("overriding print method");
			}
		};
		p.print();
		return p;		
	}
	
}


public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		PrinterDemo p2 = new PrinterDemo();
		p2.getPrinter();

	}

}
