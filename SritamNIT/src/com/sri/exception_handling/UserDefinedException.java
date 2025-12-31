package com.sri.exception_handling;

class InvalidAgeException extends Exception{
	
	private static final long serialVersionUID = 1L;
//	public InvalidAgeException() {
//		
//	}
public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}

public class UserDefinedException {
   void main() {
	   try {
	   int age = Integer.parseInt(IO.readln("enter age"));
	   validateAge(age);
	   }
	   catch(InvalidAgeException e) {		   
		   IO.println(e.getMessage());
	   }
	   
   }
   public void validateAge(int age) throws InvalidAgeException {
	   if(age<18) {
		   throw new InvalidAgeException("invalid age for voting");
	   }
	   else {
		   IO.println("you can vote");
	   }
   }
}
