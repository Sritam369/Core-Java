package com.sri.exception_handling;

import java.util.Scanner;

public class TryWithFinally {
  void main() {
	  Scanner sc = null;
	  try {
		  sc = new Scanner(System.in); 
		  System.out.println("enter a number");
		  int a = sc.nextInt();		  
		  a = 10/a;
		  IO.println(a);
		  sc.close();// we can't write it here because in case off error this line won't execute and resource will be open
	  }
	  catch(Exception e) {
		  IO.println(e);
	  }
	  finally {
		  IO.println("finally block");
		  sc.close();
	  }
  }
}
