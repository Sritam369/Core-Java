package com.sri.stream_api;

import java.util.Arrays;

public class ConvertIntegerArrayToString {
  void main() {
	  Integer[] numbers = {10,20,30,40,50};
	  Object[] arr = Arrays.stream(numbers).map(n-> "Number: "+n).toArray();
	   IO.println("Converted Strings: "+Arrays.toString(arr));
  }
}
