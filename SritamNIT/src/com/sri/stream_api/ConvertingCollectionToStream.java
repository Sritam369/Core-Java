package com.sri.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertingCollectionToStream {
  void main() {
	  List<String>list = Arrays.asList("hyd","pune","bls");
	  Stream<String>stream = list.stream();
	  stream.forEach(IO::println);
	  IO.println("=================");
	  
	  ArrayList<String>list2 = new ArrayList<>();
	  list2.add("hyd");
	  list2.add("pune");
	  list2.add("bls");
	  Stream<String>stream2 = list2.parallelStream(); // multi-threaded application so output will be unordered
	  stream2.forEach(IO::println);
	  
  }
}
