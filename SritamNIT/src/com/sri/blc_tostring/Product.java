package com.sri.blc_tostring;

public class Product {
	private int id;
	private String name;
	private double price;
	public void setProductDetails(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void calculateDiscount() {
		if(price<1000) {
			double discount=price*5/100;
			price-=discount;
			System.out.println("discount amount: "+discount);
		}
		else if(price>=1000 && price<=5000) {
			double discount=price*10/100;
			price-=discount;
			System.out.println("discount amount: "+discount);
		}
		else {
			double discount=price*15/100;
			price-=discount;
			System.out.println("discount amount: "+discount);
		}
		System.out.println("price after discount : "+price);
	}
	
	public String toString() {
		return "Product [product id=" + id + ", product name=" + name + ", product price=" + price + "]";
	}
	
}
