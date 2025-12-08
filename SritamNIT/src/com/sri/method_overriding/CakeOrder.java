package com.sri.method_overriding;

import java.util.Scanner;

abstract class Cake {
	private String shape;
	private String flavour;
	private int quantity;
	public static double price = 400;

	public Cake(String shape, String flavour, int quantity) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "A " + this.shape + " " + this.flavour + " Cake of " + this.quantity + " KG is ready @ Rs." + quantity * price + "";
	}
}

class OrderedCake extends Cake {
	private String message;

	public OrderedCake() {
		super("round", "Vanilla", 1);
	}

	public OrderedCake(String shape, String flavour, int quantity) {
		super(shape, flavour, quantity);
	}


	public OrderedCake(String shape, String flavour, int quantity, String message) {
		super(shape, flavour, quantity);
		this.message = message;
	}

	@Override
	public String toString() {
		if (message==null || message.trim().isEmpty()) {
			return super.toString();

		} else {
			return "A " + getShape() + " " + getFlavour() + " Cake of " + getQuantity() + " KG is ready with " + this.message
					+ " message @ Rs." + getQuantity() * price + "";

		}
	}

}

public class CakeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter shape");
		String shape = sc.nextLine();
		
		System.out.println("enter flavour");
		String flavour = sc.nextLine();
		
		System.out.println("enter quantity");
		int quantity = Integer.parseInt(sc.nextLine());
		
		System.out.println("enter message");
		String message = sc.nextLine();
		

		Cake c= new OrderedCake();
		System.out.println(c);

		c = new OrderedCake(shape, flavour, quantity);
		System.out.println(c);

		c = new OrderedCake(shape, flavour, quantity,message);
		System.out.println(c);

	}

}
