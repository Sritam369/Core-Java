package com.sri.factory_method;

public class Product {
private int id;
private String name;
private double price;
private Product(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
}

public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

public static Product getProductObject(int id,String name,double price) {
	return new Product(id,name,price);
}
}
