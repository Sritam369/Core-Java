package com.sri.elc;

import java.util.Scanner;

import com.sri.blc.Product;

public class ProductData {

	public static void main(String[] args) {
	  Product pd=new Product();
       Scanner sc=new Scanner(System.in);
       System.out.print("enter product id");
       int id=Integer.parseInt(sc.nextLine());
       System.out.print("enter product name");
       String name=sc.nextLine();
       System.out.print("enter product price");
       double price=Double.parseDouble(sc.nextLine());
       pd.setProduct(id, name, price);
       pd.getProduct();
       sc.close();
	}

}
