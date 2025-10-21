package com.sri.blc;

public class BiggerNumber {
int a;
int b;
int c ;
public void setBiggerNumber(int x, int y, int z) {
	a=x;
	b=y;
	c=z;
}
public void getBiggerNumber() {
	if(a>b && a>c) {
		System.out.println("a is bigger");
	}
	else if(b>a && b>c) {
		System.out.println("b is bigger");
	}
	else if(a==b && a==c && b==c) {
		System.out.println("all are equal");
	}
	else {
		System.out.println("c is bigger");
	}
}
}
