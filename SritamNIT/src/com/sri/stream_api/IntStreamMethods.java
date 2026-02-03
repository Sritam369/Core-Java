package com.sri.stream_api;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamMethods {
  void main() {
	  IntStream.range(11, 20).forEach(IO::println);
	  
	  int arr[] = {10,20,30,40,50,60};
	  int sum = Arrays.stream(arr).sum();	   
	  IO.println("Sum of all the elements : "+sum);
	  OptionalInt min = Arrays.stream(arr).min();
	  IO.println("min of all the elements : ");
	  min.ifPresent(IO::println); 
	  IO.println("max of all the elements : "+Arrays.stream(arr).max());
	  IO.println("Average of all the elements is : ");
	  OptionalDouble avg = Arrays.stream(arr).average();
	  avg.ifPresent(IO::println);
	  IO.println("Total elements : ");
	  long count = Arrays.stream(arr).count();
	  IO.println(count);
	  
  }
}
