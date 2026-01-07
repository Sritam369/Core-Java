package com.sri.collection_framework;

import java.util.Iterator;
import java.util.Vector;

record Book(Integer id,String title,String author) {
	
}

class Library{
	public void displayAvailableBooks(Vector<Book> v) {
		IO.println("Available Books in the Library:");
		v.forEach(IO::println);
	}
	public void issueBook(Vector<Book>v , int find) {
		boolean isFound=false;
		Iterator<Book>itr = v.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();			
		if(b.id()==find) {
			itr.remove();
			isFound=true;
		}
		}
		if(!isFound) {
			IO.println("Book with id "+find+" not found");
		}
	}
	public void searchBook(Vector<Book>v , String find) {
		boolean isFound=false;
		for(Book books:v) {
			if(books.title().equalsIgnoreCase(find) || books.author().equalsIgnoreCase(find)) {
				IO.println(books);
				isFound=true;
				break;
			}			
		}
		if(isFound==false) {
			IO.println("Matching book not found.");
		}
	}
}

public class LibraryManagement {
  void main() {
	  Vector<Book>v = new Vector<>();
	  v.add(new Book(101,"Core java","Mr. James"));
	  v.add(new Book(102,"Adv java","Mr. Robert"));
	  v.add(new Book(103,"Head First java","Miss Kathy Sierra"));
	  v.add(new Book(104,"Programming in C","Mr. Denis"));
	  
	  IO.println("Select from the Menu:");
	  IO.println("1) Display Books Available in the Library");
	  IO.println("2) Search a Book in the Library");
	  IO.println("3) Issue a Book from the Library");
	  IO.println("4) Exit from the application");
	  int choice =0;
	  while(choice!=4) {
	   choice = Integer.parseInt(IO.readln("Enter your choice"));
	  
	  Library l = new Library();
	  if(choice==1) {
		  l.displayAvailableBooks(v);
	  }
	  else if(choice==2) {
		  String find = IO.readln("Enter keyword to search by title or author");
		  l.searchBook(v, find);
	  }
	  else if(choice==3) {
		  int id = Integer.parseInt(IO.readln("Enter book id which for book issue"));
		  l.issueBook(v, id);
	  }
	  else if(choice==4) {
		  System.exit(0);
	  }
	  else {
		  IO.println("Invalid choice");
	  }
	  }
  }
}
