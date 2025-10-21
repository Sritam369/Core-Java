package com.exam.nit;

public class Hotel {
public static double calculateTotalAmount(double rate, int days) {
	return rate*days;
}
public static double calculateDiscountedAmount( int days,double rent) {
	if(days>=10) {
		return rent-(rent*20/100);
	}
	else if(days>=5&&days<=9) {
		return rent-(rent*10/100);
	}
	else if(days>=3&&days<=4) {
		return rent-(rent*5/100);
	}
	else {
		return rent;
	}
}
}
