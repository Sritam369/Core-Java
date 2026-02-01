package com.sri.stream_api;

import java.util.stream.Stream;

record Product(Integer id,String name) {
	
}

// public static <T>Stream of(T... values)
public class StreamOfMethod {
  void main() {
	  Product p1 = new Product(101,"mobile");
	  Product p2 = new Product(102,"laptop");
	  Product p3 = new Product(103,"camera");
	  
	  Stream.of(p1,p2,p3).forEach(IO::println);
  }
}
