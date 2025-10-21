package com.sri.encapsulation;

import java.util.Scanner;

public class InventoryData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item name");
		String name=sc.nextLine();
		System.out.println("enter item price per unit");
		double price=Double.parseDouble(sc.nextLine());
		System.out.println("enter item quantity");
		int quantity=Integer.parseInt(sc.nextLine());
		Inventory iv=new Inventory(name,price,quantity);
		
		while(true) {
			System.out.println(iv);
			System.out.println("total price is: "+iv.calaculateTotalValue());
			System.out.println("any updation: ");
			String updation=sc.nextLine();
			if(updation.equals("yes")) {
				System.out.println("enter item price per unit");
				double newprice=Double.parseDouble(sc.nextLine());
				System.out.println("enter item quantity");
				int newquantity=Integer.parseInt(sc.nextLine());
				iv.setPricePerUnit(newprice);
				iv.setQuantity(newquantity);
				System.out.println(iv);
				System.out.println("total price is: "+iv.calaculateTotalValue());
		}
			else {
				System.exit(0);
			}
				
		}
		
	}

}
