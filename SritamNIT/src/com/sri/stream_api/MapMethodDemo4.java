package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

public class MapMethodDemo4 {
  void main() {
	  List<String>list  = Arrays.asList("jaya","arnav","virat","aryan");
	 List<Character> list2 =  list.stream().map(name->name.charAt(0)).toList();
	 IO.print(list2);
  }
}
