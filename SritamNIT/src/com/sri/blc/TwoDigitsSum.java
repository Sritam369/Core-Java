package com.sri.blc;

public class TwoDigitsSum {
  public static void getSumOfDigits(int x) {
	  int sum=x%10+x/10;
	  System.out.println("sum of two digits is"+sum);
  }
}
