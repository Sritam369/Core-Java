package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

// add 10 to all the numbers 
public class MapMethodDemo {
  void main() {
	  List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  list.stream().map(num->num+10).forEach(IO::println);
	  
	  //find the cube of all unique even numbers 
	  List<Integer>list2 = Arrays.asList(1,2,2,3,4,4,5,6,7,8,9,10,8,6);
	  list2.stream()
	           .distinct() // will give only unique numbers
	                 .filter(num->num%2==0)
	                  .map(num-> num*num*num)
	                    .forEach(IO::println);
  }
}
