package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

public class FilterDemo4 {
  void main() {
	  IO.println("Lazy evaluation");
	  List<String>list = Arrays.asList("Apple","Banana","Cherry");
	  list.stream().filter(fruit->{
	    IO.println("Filtering : "+fruit);
	    return fruit.startsWith("A");
	  }); // here the intermediate operation i.e filter() won't work because no terminal method is called.
	  
	  list.stream().filter(fruit->{
		    IO.println("Filtering : "+fruit);
		    return fruit.startsWith("A");
		  }).forEach(IO::println); // terminal operation
  }
}
