package com.sri.stream_api;

import java.util.Arrays;

public class NamesContainingLetterA {
  void main() {
	  String[] names = {"rahul","raj","arnav","scott"};
	  Object[] arr = Arrays.stream(names).filter(name->name.contains("a")).toArray();
	  IO.println(Arrays.toString(arr));
  }
}
