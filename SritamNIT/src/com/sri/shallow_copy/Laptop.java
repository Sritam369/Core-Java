package com.sri.shallow_copy;

public class Laptop {
private String brand;
private double price;
public Laptop(String brand,double price) {
	this.brand=brand;
	this.price=price;
}
public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(Double price) {
	this.price=price;
}
public Double getPrice() {
	return price;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", price=" + price + "]";
}

}
