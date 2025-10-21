package com.sri.blc;
import java.text.DecimalFormat;
public class Calculator {
  public static void add(int x, int y) {
	  int sum=x+y;
	 System.out.println("addition is"+sum);
  }
  public static void sub(int x,int y) {
	  int sub=x-y;
		 System.out.println("substraction is"+sub);
  }
  public static void mul(int x,int y) {
	  int mul=x*y;
		 System.out.println("multiplication is"+mul);
  }
  public static void div(int x,int y) {
	  int div=x/y;
	  DecimalFormat df= new DecimalFormat("00.00");
	  String division=df.format(div);
		 System.out.println("division is"+division);
  }
}
