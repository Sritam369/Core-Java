package com.sri.exception_handling;

class ParentClass{
	public void loadingClass(String x) throws ClassNotFoundException {
		Class.forName(x);		
	}
}
class ChildClass extends ParentClass{
	public void loadingClass(String x) throws ClassNotFoundException {
		
		try {
		if(x.equals("null") || x.isBlank()) {		
			throw new IllegalArgumentException();
		}
		else {			
			super.loadingClass(x);
		}
		
		}
		catch(IllegalArgumentException e) {
			IO.println("put some value in input");
		}
		
	}
}

public class ExceptionHandlingInInheritance {
   public static void main(String args[]) {
	  
	   ParentClass p = new ChildClass();
	   try {
		   for(int i=0;i<args.length;i++) {
		p.loadingClass(args[i]);
		   
		IO.println("Class "+args[i]+" loaded successfully");
		   }
		   
	} 
	   catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
   }
}
