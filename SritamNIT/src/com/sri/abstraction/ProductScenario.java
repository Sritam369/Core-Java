package com.sri.abstraction;

import java.util.Scanner;

abstract class Product{
	private String name;
	private double price;
	private String catagory;
	
	public Product(String name, double price, String catagory) {
		super();
		this.name = name;
		this.price = price;
		this.catagory = catagory;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", catagory=" + catagory + "]";
	}
}
class DigitalProduct extends Product{
	private String licenseKey;
	public DigitalProduct(String name,double price,String catagory,String licenseKey) {
		super(name,price,catagory);
		this.licenseKey=licenseKey;
	}
	public void applyDiscount(double percentage) {
		double discount = getPrice()*percentage/100;
		double total = getPrice()-discount;
		setPrice(total);
		System.out.println("discount is: "+discount);
		System.out.println("price after discount : "+total);
	}
	
	public double calculateTax() {
		return getPrice()*0.05;
	}
	@Override
	public String toString() {
		return "DigitalProduct [name = "+getName()+" , licenseKey=" + licenseKey + ", price=" + getPrice() + ", catagory=" + getCatagory() + "]";
	}	
}
class PysicalProduct extends Product{
	private double shipingWeight;

	public PysicalProduct(String name, double price, String catagory, double shipingWeight) {
		super(name, price, catagory);
		this.shipingWeight = shipingWeight;
	}
	
	public void applyDiscount(double percentage) {
		double discount = getPrice()*percentage/100;
		double total = getPrice()-discount;
		setPrice(total);
		System.out.println("discount is: "+discount);
		System.out.println("price after discount : "+total);
	}
	
	public double calculateTax() {
		return getPrice()*0.08;
	}
	
	public double calculateShippingCost() {
		double cost = shipingWeight*5;
		return cost;
	}

	@Override
	public String toString() {
		return "PysicalProduct [shipingWeight=" + shipingWeight + ", Cost=" + calculateShippingCost() + ", Price="
				+ getPrice() + ", Catagory=" + getCatagory() + "]";
	}	
}

public class ProductScenario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select product type");
		System.out.println("1.digital product");
		System.out.println("2.physical product");
		System.out.println("3.to exit");
		while(true) {
		System.out.println("enter a number");
		int choice = Integer.parseInt(sc.nextLine());		
		if(choice==1) {
			System.out.println("enter digital product name");
			String name = sc.nextLine();
			System.out.println("enter digital product price");
			double price =Double.parseDouble(sc.nextLine());
			System.out.println("enter digital product catagory");
			String catagory = sc.nextLine();
			System.out.println("enter digital product licensekey");
			String license = sc.nextLine();
			System.out.println("enter digital product discount percentage");
			double percentage =Double.parseDouble(sc.nextLine());
			
			Product p = new DigitalProduct(name,price,catagory,license);
			System.out.println(p);
			p.applyDiscount(percentage);
			System.out.println("Tax RS : "+p.calculateTax());
			
		}
		else if(choice==2) {
			System.out.println("enter pysical product name");
			String name = sc.nextLine();
			System.out.println("enter  product price");
			double price =Double.parseDouble(sc.nextLine());
			System.out.println("enter  product catagory");
			String catagory = sc.nextLine();
			System.out.println("enter  product shipping weight");
			double ship =Double.parseDouble(sc.nextLine());
			System.out.println("enter  product discount percentage");
			double percentage =Double.parseDouble(sc.nextLine());
			
			Product p = new PysicalProduct(name,price,catagory,ship);
			System.out.println(p);
			p.applyDiscount(percentage);
			System.out.println("Tax RS : "+p.calculateTax());
			PysicalProduct ph = (PysicalProduct)p;
			System.out.println("shipping cost : "+ph.calculateShippingCost());
		}
		else if(choice==3) {
			System.out.println("you exited");
			System.exit(0);
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		}
		
		
	}

}
