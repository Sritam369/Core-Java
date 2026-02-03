package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
  void main() {
	  List<String> indPlayer = Arrays.asList("virat","rohit","surya","bumrah");
	  List<String> nzPlayer = Arrays.asList("rachin","sodhi","santner","daryll");
	  
	  List<List<String>> nestedList = Arrays.asList(indPlayer,nzPlayer);
	  IO.println("Nested collection : "+nestedList);
	  
	  IO.println("After flattening");
	  List<String>flatcoll = nestedList.stream().flatMap(list->list.stream()).toList();
	  IO.println(flatcoll);
  }
}
