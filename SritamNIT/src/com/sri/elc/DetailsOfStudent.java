package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.StudentDetails;

import java.text.DecimalFormat;
public class DetailsOfStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name");
		String name=sc.nextLine();
		System.out.print("enter roll");
		int roll=Integer.parseInt(sc.nextLine());
		System.out.print("enter fees");
		double fees=Double.parseDouble(sc.nextLine());
		DecimalFormat df=new DecimalFormat("00.00");
		String feesOfStudent=df.format(fees);
		System.out.println("student details are"+StudentDetails.details(roll, name, fees));
		sc.close();

	}

}
