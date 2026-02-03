package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

record Products(Integer id,List<String> listOfProducts) {
	
}

public class FlatMapDemo3 {
  void main() {
	  List<Products> list = Arrays.asList(new Products(101,Arrays.asList("camera","mobile","laptop")),new Products(102,Arrays.asList("bat","ball","wicket")),new Products(103,Arrays.asList("chair","table","lamp")),new Products(104,Arrays.asList("cycle","bike","car")));
	  List<String> flatProd = list.stream().flatMap(prod-> prod.listOfProducts().stream()).toList();
	  IO.println(flatProd);
  }
}
