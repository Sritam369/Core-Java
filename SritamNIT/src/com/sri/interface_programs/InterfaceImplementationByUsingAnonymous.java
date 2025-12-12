package com.sri.interface_programs;

interface Printer{
	void print();
}
class PrinterDemo{
	public Printer getPrinter() {
		return new Printer() {		
			public void print() {
				System.out.println("overriden print method");
			}
		};
	}	
}

public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		PrinterDemo p2 = new PrinterDemo();
		p2.getPrinter().print();

	}

}
