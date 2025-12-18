package com.sri.exception_handling;

import java.util.InputMismatchException;

public class MultipleCatchDemo2 {
    void main() {
	try {
		raiseException();
	}
	catch(NullPointerException n){
		 IO.println("reference is pointing to null");
	 }
	 catch(ArrayStoreException a){
		 IO.println("inserting illegal data in the array");
	 }
	 catch(Exception e) {
		 IO.println("General problem");
	 }
}
    void raiseException() {
    	String str = null;
    IO.println(str.length()); // from here the exception is propagating to the caller method
		 
    Object obj[]=new Integer[3];
	obj[0]=100;
	obj[1]=true;
    }
}
