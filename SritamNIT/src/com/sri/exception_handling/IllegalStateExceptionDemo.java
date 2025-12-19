package com.sri.exception_handling;

public class IllegalStateExceptionDemo {
   void main() {
	   IO.println("calling throwIllegalException from main method:");
	   throwIllegal();
   }
   public static void throwIllegal() {
	   try {
		   throw new IllegalStateException("MyException");
	   }
	   catch(IllegalStateException e) {
		   System.out.println("Caught: "+e);
	   }
   }
}
