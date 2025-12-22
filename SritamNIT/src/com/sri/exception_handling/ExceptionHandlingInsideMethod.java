package com.sri.exception_handling;

public class ExceptionHandlingInsideMethod {
   void main() {
	   String a = IO.readln("enter a number");
	   if(a.equals("null")) {
		   a=null;
	   }
	   handle(a);
   }
   public static void handle(String number) {
	   try {
	   IO.println("Length of the input string: "+number.length());
	   Integer num = Integer.parseInt(number);	   
	   IO.println("Converted to integer: "+num);
	   IO.println("Uppercase version: "+number.toUpperCase());
	   }
	   catch(Exception e) {
		   if(e instanceof NumberFormatException) {
			   IO.println("NumberFormatException: Input is not a valid integer.");
		   }
		   else {
			   IO.println("NullPointerException: Input is null.");
		   }
	   }
   }
}
