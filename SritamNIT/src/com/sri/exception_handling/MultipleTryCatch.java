package com.sri.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {
 void main() {
	 try {
		 String str = null;
		 IO.println(str.length());
	 }
	 catch(NullPointerException n){
		 IO.println("reference is pointing to null");
	 }
	 try {
		Object obj[]=new Integer[3];
		obj[0]=100;
		obj[1]=true;
	 }
	 catch(ArrayStoreException a){
		 IO.println("inserting illegal data in the array");
	 }
	 try {
		 Scanner sc = new Scanner(System.in);
		 IO.println("enter your age");
		 int age = sc.nextInt();
		 IO.println("Your age is "+age);
		 sc.close();
	 }
	 catch(InputMismatchException i) {
		 IO.println("please give integer value as input");
	 }
 }
}
