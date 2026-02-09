package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;

public class FlatMapToIntMethod {
  public static void main(String[] args) {
	  int[] arr1 = {11,12,13};
	  int[] arr2 = {21,22,23};
	  int[] arr3 = {31,32,33};
	  
	  List<int[]> list = Arrays.asList(arr1,arr2,arr3);
	  int[] brr = list.stream().flatMapToInt(n-> Arrays.stream(n)).toArray();
	  IO.println(Arrays.toString(brr));
  }
}
