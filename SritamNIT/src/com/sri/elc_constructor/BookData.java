package com.sri.elc_constructor;

import java.util.Scanner;

import com.sri.blc_constructor.Book;

public class BookData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter title");
		String title=sc.nextLine();
		System.out.println("enter author name");
		String author=sc.nextLine();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter discount");
		double discount=sc.nextDouble();
	    Book bk=new Book(title,author,price);
        System.out.println(bk);
        bk.applyDiscount(discount);
        sc.close();
}
}