package com.sri.elc;
import java.util.Scanner;

import com.sri.blc.AreaOfCircle;
public class CircleArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter radius");
		double rad=Double.parseDouble(sc.nextLine());
		AreaOfCircle.getAreaOfCircle(rad);
        sc.close();
	}

}
