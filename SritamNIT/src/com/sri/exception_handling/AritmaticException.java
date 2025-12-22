package com.sri.exception_handling;

public class AritmaticException {
   void main() {
	   int x = Integer.parseInt(IO.readln("enter dividend"));
	   int y = Integer.parseInt(IO.readln("enter divisor"));
	   performDivision(x,y);
   }
   public static int performDivision(int dividend,int divisor) {
	   try {
		   int a = dividend/divisor;
		   IO.println("Result of division: "+a);
		   return a;
	   }
	   catch(ArithmeticException e) {
		   IO.println("ArithmeticException caught: division by zero: dividend="+dividend+", divisor="+divisor+" ");
		   return 0;
	   }
   }
}
