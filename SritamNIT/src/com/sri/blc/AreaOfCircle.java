package com.sri.blc;
import java.text.DecimalFormat;
public class AreaOfCircle {
  public static void getAreaOfCircle(double radius) {
	  double area = Math.PI*radius*radius;
	  DecimalFormat df= new DecimalFormat("00.00");
	  String areaOfCircle = df.format(area);
	  System.out.println("area of circle is"+areaOfCircle);
  }
}
