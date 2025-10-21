package com.sri.blc_constructor;

public class Book {
	private String title;
	private String author;
	private double price;
	public Book(String title, String author, double price) {
		
		this.title = title;
		this.author = author;
		if(price<0) {
			System.err.println("book price can not be negative");
			System.exit(0);
		}
		else {
		this.price = price;
		}
	}
	public void applyDiscount(double discount) {
		if(discount<0 || discount>price) {
			System.err.println("invalid discount");
			
		}
		else {
		double total=price-discount;
		System.out.println("total price after discount is "+total);
		}
	}
	
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}

