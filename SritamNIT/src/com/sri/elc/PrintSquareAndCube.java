package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.SquareAndCube;
public class PrintSquareAndCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter a number");
		int result=sc.nextInt();
		System.out.println("result is"+SquareAndCube.findSquareAndCube(result));
		sc.close();

	}

}
