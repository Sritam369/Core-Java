package com.sri.exception_handling;

public class RectangleAreaDemoWithExceptionHandling {
    void main() {
    	int a = Integer.parseInt(IO.readln("Enter length"));
    	int b = Integer.parseInt(IO.readln("Enter width"));
    	
   try {
	  if( calculateArea(a,b)<=0) {
		  throw new IllegalArgumentException("Length and width must be > 0");
	  }
   }
   catch (IllegalArgumentException e) {
	   IO.println(e.getMessage());
	   return;
}
    	  IO.println("Area of rectangle with length "+a+" and width "+b+" is: "+calculateArea(a,b));
    }
    
    public static double calculateArea(double length,double width) {
    	
      		double area = length*width;  		
    		    return area;	    
    }
}
