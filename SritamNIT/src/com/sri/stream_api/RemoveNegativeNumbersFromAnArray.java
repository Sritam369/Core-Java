package com.sri.stream_api;

import java.util.Arrays;

public class RemoveNegativeNumbersFromAnArray {
  void main() {
	  Integer[] numbers = {-10,-5,0,5,10,15,-20};
	  Object[] arr = Arrays.stream(numbers).filter(n->n>0).toArray();
	  IO.println(Arrays.toString(arr));
  }
}
