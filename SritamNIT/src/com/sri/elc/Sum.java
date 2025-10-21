package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.CalculateSum;
public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number");
		int result=Integer.parseInt(sc.nextLine());
		System.out.print("enter second number");
		int result2=Integer.parseInt(sc.nextLine());
		CalculateSum.doSum(result, result2);
        sc.close();
	}

}
