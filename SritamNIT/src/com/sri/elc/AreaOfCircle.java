package com.sri.elc;
import java.util.Scanner;
import java.text.DecimalFormat;
import com.sri.blc.CircleArea;
public class AreaOfCircle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter radius");
	double rad=sc.nextDouble();
	String area= CircleArea.getArea(rad);
	double areaOfCircle=Double.parseDouble(area);
	DecimalFormat df=new DecimalFormat("00.00");
	String radius=df.format(areaOfCircle);
	System.out.println("area is"+radius);
	sc.close();

	}

}
