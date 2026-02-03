package com.sri.stream_api;

import java.util.Arrays;

public class toArrayMethod {
  void main() {
	  String[] names = {"Scott","Raj","Riya","Smith","Sachin"};
	  Object[] array = Arrays.stream(names).filter(name -> name.length()>3).toArray();
	  IO.println(Arrays.toString(array));
  }
}
