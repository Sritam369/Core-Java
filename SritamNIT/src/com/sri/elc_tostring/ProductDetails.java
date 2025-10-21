package com.sri.elc_tostring;

import java.util.Scanner;

import com.sri.blc_tostring.Product;

public class ProductDetails {

	public static void main(String[] args) {
		Product pd=new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("enter product name");
        String name=sc.nextLine();
        System.out.println("enter product price");
        double price=Double.parseDouble(sc.nextLine());
        pd.setProductDetails(id, name, price);
        System.out.println(pd.toString());
        pd.calculateDiscount();
        sc.close();
	}

}
