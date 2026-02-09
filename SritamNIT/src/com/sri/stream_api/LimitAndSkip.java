package com.sri.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class LimitAndSkip {
  public static void main(String[] args) {
	  Stream<String> stm = Stream.of("virat","rohit","dhoni","sikhar","bumrah");
	  //stm.limit(2).forEach(IO::println);
	  //stm.skip(2).forEach(IO::println);
	  List<String> s = stm.peek(name->IO.println(name)).toList();
	  IO.println(s);
  }
}
