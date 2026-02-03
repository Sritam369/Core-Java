package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
  void main() {
	  List<Integer> list = Arrays.asList(1,2,3,4,5);
	  for(Integer l:list) {
		  if(l%2==0) {
			  IO.println(l);
		  }
	  }
	  
	  IO.println("With filter method");
	  list.stream().filter(num -> num%2==0).forEach(IO::println);
  }
}
