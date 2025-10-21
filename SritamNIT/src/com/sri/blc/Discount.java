package com.sri.blc;

public class Discount {
 public static void calculateDiscount(double amount) {
	 if(amount>=5000) {
		 double bill=amount-(amount*20/100);
		 System.out.println("final bill is"+bill);
	 }
	 else if(amount>=3000) {
		 double bill=amount-(amount*15/100);
		 System.out.println("final bill is"+bill);
	 }
	 else if(amount>=1000) {
		 double bill=amount-(amount*10/100);
		 System.out.println("final bill is"+bill);
	 }
	 else {
		 double bill=amount-(amount*5/100);
		 System.out.println("final bill is"+bill);
	 }
 }
}
