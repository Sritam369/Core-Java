package com.sri.blc;
import java.text.DecimalFormat;
public class CalculateSum {
  public static void doSum(int x, int y) {
	  int sum=x+y;
	  DecimalFormat df=new DecimalFormat ("00.00");
	  String sumOfNumbers=df.format(sum);
	  System.out.println("sum of 2 numbers is"+sumOfNumbers);
  }
}
