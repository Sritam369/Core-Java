package com.sri.stream_api;

import java.util.stream.Stream;

public class GeneratingInfiniteStream {
  void main() {
	  Stream<Double> stream = Stream.generate(()-> Math.random());
	  stream.limit(5).forEach(IO::println); // only 5 streams will be generated because of limit()
	  
	  Stream<Integer> stream2 = Stream.iterate(1,n-> n+2);
	  stream2.forEach(IO::println); // infinite streams
  }
}
