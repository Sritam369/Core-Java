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
		   if(x.equals("123")) {
			   arr[i]=Integer.parseInt(x);
		   }
		   arr[i]=x;
	   }
	   for(Object arrs:arr) {
		   IO.println("Casting successful: "+arrs);
	   }
	   
	   }
	   catch(ClassCastException e) {
		   e.printStackTrace();
	   }
	   
   }
}
