package com.sri.exception_handling;

public class CommandLineDivision {
   void main(String[] args) {
	   try {
	   Integer dividend = Integer.parseInt(args[0]);
	   Integer divisor = Integer.parseInt(args[1]);
	   for(int i=0;i<args.length;i++) {
	  if(args.length>2 || args.length<2) {
		  throw new IllegalArgumentException();
	  }
	   }
	   try {
		   Integer result = dividend/divisor;
		   IO.println("Division result: "+result);
		   IO.println("Division operation successfull");
	   }
	   catch(ArithmeticException e) {
		   IO.println("Arithmetic error: / by zero");
	   }
	   }
	   catch(Exception e) {
		   if(e instanceof NumberFormatException) {
		  IO.println("please enter integer values");
		   }
		   else {
			   IO.println("please enter only 2 integers");
		   }
	   }
   }
}
