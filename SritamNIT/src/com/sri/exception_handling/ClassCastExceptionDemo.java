package com.sri.exception_handling;

public class ClassCastExceptionDemo {
   void main() {
	   handleClassCast();
   }
   public static void handleClassCast() {
	   try {
	   int size = Integer.parseInt(IO.readln("Enter size"));
	   Object arr[]= new Object[size];
	   for(int i=0;i<size;i++) {
		  String x = IO.readln("enter value");	   
		   if(x.matches("\\d+")) {
			   arr[i] =Integer.parseInt(x);			   		   
		   }
		   else if(x.equals("true") || x.equals("false")) {
			   arr[i]=Boolean.parseBoolean(x);
		   }
		   else {
		   arr[i]=x;
		   }
	   }

	   for(Object arrs:arr) {
		   String x = (String)arrs;
		   IO.println("Casting successful: "+x);
	   }
		   
	   }
	   catch(ClassCastException e) {
		   e.printStackTrace();
	   }
	   
	   
   }
}
