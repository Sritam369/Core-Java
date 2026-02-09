package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
	 public static void main(String[] args) {
		 List<String> list = Arrays.asList("a","b","c","d");
		 String result = list.stream().collect(Collectors.joining("*"));
		 IO.println(result);
	 }
}
