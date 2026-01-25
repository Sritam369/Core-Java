package com.sri.collection_framework;

import java.util.LinkedList;

record Product(int id,String name) {
	
}

public class LinkedListDemo2 {
  void main() {
	  LinkedList<Product> list = new LinkedList<>();
	  list.add(new Product(2, "ApplePhone"));
	  list.add(new Product(1, "MIPhone"));
	  list.add(new Product(3, "VivoPhone"));
	  
	  // Retrieving the object based on index.
	  IO.println(list.get(1));
	  
	  IO.println("Sorting based on ID");
	  list.sort((p1,p2)-> Integer.compare(p1.id(), p2.id()));
	  list.forEach(IO::println);
  }
}
