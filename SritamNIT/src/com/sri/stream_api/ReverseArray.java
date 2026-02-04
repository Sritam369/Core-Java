package com.sri.stream_api;

import java.util.Arrays;

public class ReverseArray {
  void main() {
	  Integer arr[] = {1,2,3,5,7,8,9};
	  Object sort[] = Arrays.stream(arr).sorted((n1,n2)->n2.compareTo(n1)).toArray();
	  
	  IO.println(Arrays.toString(sort));
  }}