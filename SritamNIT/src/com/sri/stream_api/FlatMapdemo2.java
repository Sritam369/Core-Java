package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapdemo2 {
  void main() {
	List<String> names = Arrays.asList("jaya","aryan","virat","aakash");
	names.stream().flatMap(str->Stream.of(str.charAt(0))).forEach(IO::println);
  }
}
