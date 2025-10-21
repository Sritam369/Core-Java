package com.sri.blc;

public class Hotel {
  public static double calculateTotalAmount(double roomRate, int days) {
	  double total=roomRate*days;
	  System.out.println("total room rate is"+total);
	
	  return total;
  }
  public static void calculateDiscountedAmount(int days, double total) {
	  if(days>=10){
		  double finalAmount=total-(total*20/100);
		  System.out.println("rent is"+finalAmount);
	  }
	  else if(days>=5&&days<=9){
		  double finalAmount=total-(total*10/100);
		  System.out.println("rent is"+finalAmount);
	  }
	  else if(days>=3&&days<=4){
		  double finalAmount=total-(total*5/100);
		  System.out.println("rent is"+finalAmount);
	  }
	  else {
		  double finalAmount=total;
		  System.out.println("rent is"+finalAmount);
	  }
  }
}
