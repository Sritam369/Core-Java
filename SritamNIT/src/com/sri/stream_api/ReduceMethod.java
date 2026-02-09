package com.sri.stream_api;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceMethod {
  public static void main(String[] args) {
	  Stream<Integer> intStreams = Stream.of(1,2,3,4,5,6,7,8);
	  Optional<Integer> optnl = intStreams.reduce((a,b)->a+b);
	  IO.println(optnl);
  }
}
