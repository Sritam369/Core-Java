package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.Square;
public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter side");
        int square=sc.nextInt();
        System.out.println("area of square is"+Square.areaOfSquare(square));
        sc.close();
	}

}
