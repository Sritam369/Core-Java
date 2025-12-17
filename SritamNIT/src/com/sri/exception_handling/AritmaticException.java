package com.sri.exception_handling;

public class AritmaticException {
   void main() {
	   try {
		   IO.println("Welcome client, welcome to the application");
		   int x = Integer.parseInt(IO.readln("Enter first number"));
		   int y = Integer.parseInt(IO.readln("Enter second number"));
		   
		   int z = x/y;
		   IO.println("Result is : "+z);
	   }
	   catch(Exception e) {
		   IO.println(e); // fqn+error message
		   IO.println(e.getMessage()); // only error message
		   e.printStackTrace(); // all about exception
		   IO.println("don't enter zero in input"); // user defined error message
	   }
   }
}
