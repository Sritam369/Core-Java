package com.sri.blc;

public class RoundeedSum {
public static int getRoundedSum(int num1, int num2, int num3) {
	int sum=0;
	sum+=(num1%10)<5 ? (num1/10)*10 : (num1/10+1)*10;
	
	sum+=(num2%10)<5 ? (num2/10)*10 : (num2/10+1)*10;

	sum+=(num3%10)<5 ? (num3/10)*10 : (num3/10+1)*10;
	return sum;
}
}
