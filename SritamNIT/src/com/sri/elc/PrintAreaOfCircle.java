package com.sri.elc;
import java.util.Scanner;
import java.text.DecimalFormat;
import com.sri.blc.Circle;
public class PrintAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter radius");
		double radius=sc.nextDouble();
		String area=Circle.AreaOfCircle(radius);
		double areaOfCircle=Double.parseDouble(area);
		DecimalFormat df=new DecimalFormat("00.00");
		String circleArea=df.format(areaOfCircle);
		System.out.println("area of circle is"+circleArea);
        sc.close();
	}

}
