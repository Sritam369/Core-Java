package com.sri.factory_method;

import java.util.Scanner;

public class Book {
private String author;
private String title;
private Book(String author,String title) {
	this.author=author;
	this.title=title;
}
@Override
public String toString() {
	return "Book [author=" + author + ", title=" + title + "]";
}
public static Book getBookObject() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter author");
	String author=sc.nextLine();
	System.out.println("enter title");
	String title=sc.nextLine();
	return new Book(author,title);
}
}
