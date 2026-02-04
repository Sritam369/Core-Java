package com.sri.stream_api;

import java.util.stream.Stream;

// find first 10 odd square from an infinite stream
public class FindFirstTenOddSquares {
  void main() {
	  Stream<Integer> stream = Stream.iterate(1,n->n+2);
	  stream.limit(10).filter(num->num%2!=0).map(num->num*num).forEach(IO::println);	 
  }
}