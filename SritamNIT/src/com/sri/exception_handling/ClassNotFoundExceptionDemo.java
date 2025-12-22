package com.sri.exception_handling;

import java.util.Scanner;

public class ClassNotFoundExceptionDemo {
	 public ClassNotFoundExceptionDemo() {
	        System.out.println("Default constructor called.");
	    }
    
	public ClassNotFoundExceptionDemo(String x) {
		
		try {
		Class.forName(x);
		IO.println("Class loaded successfully");
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
   void main() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the class name");
	   String classname = sc.nextLine();
	   new ClassNotFoundExceptionDemo(classname);
	   sc.close();
   }
}
