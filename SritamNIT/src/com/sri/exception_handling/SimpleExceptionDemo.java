package com.sri.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
  void main() {
	  try {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter first number");
		  int a = sc.nextInt();
		  System.out.println("enter second number");
		  int b = sc.nextInt();
		  IO.println("You entered a ="+a+" and b = "+b+"");
		  sc.close();
	  }
	  catch(InputMismatchException e) {
		  IO.println(e.getMessage());
		  IO.println(e);
		  IO.println("InputMismatchException occured. please enter only integer numbers.");
		  e.printStackTrace();
	  }
  }
}
