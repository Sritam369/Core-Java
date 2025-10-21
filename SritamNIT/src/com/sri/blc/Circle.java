package com.sri.blc;

public class Circle {
public static String AreaOfCircle(double radius) {
	if(radius<=0) {
		return ""+(-1);
	}
	else {
		return ""+(Math.PI*radius*radius);
	}
}
}
