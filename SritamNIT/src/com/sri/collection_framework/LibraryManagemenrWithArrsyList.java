package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

class Books{
	private String title;
	private String author;
	private long isbn;
	private double price;
	private int quantity;
	public Books(String title,String author,long isbn,double price,int quantity) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.price=price;
		this.quantity=quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String displayBooks() {
		return "(title="+title+", author="+author+", isbn="+isbn+", price="+price+", quantity="+quantity+" ";
	}
}

class Library2{
	private ArrayList<Books>list=new ArrayList<>();
	public Library2() {
		
	}
	public void addBook(Books book) {
		boolean flag=false;
		for(Books b:list) {
			if(b.getIsbn()==book.getIsbn()) {
				flag=true;
			}
		}
		if(flag) {
			IO.println("ISBN already exists");
		}
		else {
			list.add(book);
			IO.println("Book added successfully");
		}
	}
	
	private Books searchBookByIsbn(long isbn) {
		for(Books b:list) {
			if(b.getIsbn()==isbn) {
				return b;
			}
		}
		return null;
	}
	
	public void display() {
		for(Books b:list) {
			IO.println(b.displayBooks());
		}
	}
	public void update(long isbn) {
		try {
		if(searchBookByIsbn(isbn).getIsbn()==isbn) {
			IO.println("Updating quantity of Book");
			int quantity=Integer.parseInt(IO.readln("enter new quantity"));
			if(quantity<=0) {
				IO.println("Invalid quantity");
				return;
			}
			for(Books b:list) {
				b.setQuantity(quantity);
				IO.println("Quantity updated");
			}
		}
		}
		catch(NullPointerException e) {
			IO.println("Provided ISBN doesn't exist");
		}
	}
	
	public void delete(String title) {
		if(title.isBlank()) {
			IO.println("Book title can't be blank");			
		}
		else {
			boolean flag=false;
			Iterator<Books>itr = list.iterator();
			while(itr.hasNext()) {
				Books book = itr.next();
				if(book.getTitle().equalsIgnoreCase(title)) {
					flag=true;
					itr.remove();
					IO.println("Book deleted");
					return;
				}
			}			
			if(!flag) {
				IO.println("this book title doesn't exist");
			}
		}
	}
}

public class LibraryManagemenrWithArrsyList {
   void main() {
	   Library2 l = new Library2();
	   while(true) {
		   IO.println("1. Add Book");
		   IO.println("2. Display Books");
		   IO.println("3. Update quantity");
		   IO.println("4. Delete Book");
		   IO.println("5. Exit");
		   
		   int choice=Integer.parseInt(IO.readln("enter choice"));
		   
		   if(choice==1) {
			   String title=IO.readln("enter title");
				String author=IO.readln("enter author");
				long isbn = Long.parseLong(IO.readln("enter isbn"));
				double price = Double.parseDouble(IO.readln("enter price"));
				int quantity = Integer.parseInt(IO.readln("enter quantity"));
				Books b = new Books(title,author,isbn,price,quantity);
			  l.addBook(b); 
		   }
		   else if(choice==2) {
			  l.display(); 
		   }
		   else if(choice==3) {
			 long isbn=Long.parseLong(IO.readln("enter ISBN"));
			 l.update(isbn); 
		   }
		   else if(choice==4) {
			   String title = IO.readln("enter title");
			   l.delete(title);
		   }
		   else if(choice==5) {
			   System.exit(0);
		   }
		   else {
			   IO.println("Invalid choice");
		   }
	   }
   }
}
