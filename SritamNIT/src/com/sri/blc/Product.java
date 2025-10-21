package com.sri.blc;

public class Product {
int productId;
String productName;
double productPrice;
public void setProduct(int a, String b, double c) {
	productId=a;
	productName=b;
	productPrice=c;
}
public void getProduct() {
	System.out.println("product id is "+productId);
	System.out.println("product name is "+productName);
	System.out.println("product price is "+productPrice);
}
}
