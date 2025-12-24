package com.sri.exception_handling;

public class ClassNotFoundExceptions {
	public ClassNotFoundExceptions() {
		
	}
	public ClassNotFoundExceptions(String x) {
		try {
		Class.forName(x);
		IO.println("class loaded successfully: "+x);
		}
		catch(ClassNotFoundException e) {
			IO.println("class is not present");
		}
	}
	void main() {
    	    String classname=IO.readln("enter class name");
    	    new ClassNotFoundExceptions(classname);    	    
    }
	
}
