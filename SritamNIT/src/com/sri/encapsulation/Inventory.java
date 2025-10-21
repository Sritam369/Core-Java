package com.sri.encapsulation;

public class Inventory {
private String item;
private double pricePerUnit;
private int quantity;
public Inventory(String item, double pricePerUnit, int quantity) {
	
	this.item = item;
	this.pricePerUnit = pricePerUnit;
	this.quantity = quantity;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public double getPricePerUnit() {
	return pricePerUnit;
}
public void setPricePerUnit(double pricePerUnit) {
	this.pricePerUnit = pricePerUnit;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double calaculateTotalValue() {
	return this.pricePerUnit*this.quantity;
}
@Override
public String toString() {
	return "Inventory [item=" + item + ", pricePerUnit=" + pricePerUnit + ", quantity=" + quantity + "]";
}

}
