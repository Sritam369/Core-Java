package com.exam.nit;

public class Discount {
public static double calculate(double bill) {
	
	if(bill>=5000) {
		return bill-(bill*20/100);
	}
	else if(bill>=3000) {
		return bill-(bill*15/100);
	}
	else if(bill>=1000) {
		return bill-(bill*10/100);
	}
	else {
		return bill-(bill*5/100);
	}
	
}
}
