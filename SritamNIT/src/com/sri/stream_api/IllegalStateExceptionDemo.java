package com.sri.stream_api;

import java.util.stream.Stream;

public class IllegalStateExceptionDemo {
  void main() {
	  Stream<Integer> num = Stream.of(1,2,3,45,5);
	  num.forEach(IO::println);
	  IO.println("..........");
	  num.forEach(IO::println);
  }
}
