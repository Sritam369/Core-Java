package com.sri.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleTryWithSingleCatchBlock {
   void main() {
	   try {
		   
		Object obj[]=new Integer[3];
		obj[0]=100;
		obj[1]=true;
				
		Scanner sc = new Scanner(System.in);
		IO.println("enter your age");
		int age = sc.nextInt();
		IO.println("Your age is "+age);
		sc.close();
	   }
	   catch(ArrayStoreException | InputMismatchException e) {
		   if(e instanceof ArrayStoreException) {
			   IO.println("put integer values in the array");
		   }
		   else if(e instanceof InputMismatchException) {
			   IO.println("put integer value as input");
		   }
		   
	   }
   }
}
