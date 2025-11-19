package com.sri.hasa_relation;

import java.util.Scanner;

class Order{
	private String orderId; 	
	private String itemName; 
	private double price;
	public Order(String orderId, String itemName, double price) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
}

class Customer{
	private String name;
	private String email; 
	private String address; 
	private long mobileNo; 
	private Order order;
	public Customer(String name, String email, String address, long mobileNo,String orderId, String itemName, double price ) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.order = new Order(orderId,  itemName,  price);
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", order=" + order.toString() + "]";
	} 
	
}

public class CustomerManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter email");
		String email = sc.nextLine();
		System.out.println("enter address");
		String address = sc.nextLine();
		System.out.println("enter mobile no");
		long mob =Long.parseLong( sc.nextLine());
		System.out.println("enter orderid");
		String id = sc.nextLine();
		System.out.println("enter item name");
		String item = sc.nextLine();
		System.out.println("enter price");
		double price =Double.parseDouble(sc.nextLine());
		Customer c = new Customer(name,email,address,mob,id,item,price);
		System.out.println(c);
		sc.close();
	}

}
