package com.sri.blc;

public class CircleArea {
	
public static String getArea(double rad) {
	if(rad<=0) {
		return ""+(0);
	}
	else {
		return ""+ (Math.PI*rad*rad);
	}
}
}
