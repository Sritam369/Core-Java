package com.sri.oop;

public class Fan {
String name;
String coil;
int wings;
public void switchOn() {
	System.out.println("Fan name is "+name);
	System.out.println("Fan coil is "+coil);
	System.out.println("Fan wings is "+wings);
}
public void switchOff() {
	System.out.println("upon switching off the switch i will stop rotating");
}
}
