package com.sri.collection_framework;

import java.util.TreeSet;

record Book2(String name, String author) implements Comparable<Book2> {
	 public int compareTo(Book2 b) {
		 return this.name().compareTo(b.name());
	 }
}

public class BookSort {
  void main() {
	  TreeSet<Book2>set=new TreeSet<>();
	  set.add(new Book2("java","james gosling"));
	  set.add(new Book2("adv java","james gosling"));
	  set.add(new Book2("html","tim berners lee"));
	  set.add(new Book2("c","denis ritchie"));
	  set.add(new Book2("css","sritam"));
	  
	  IO.println(set);
  }
}
