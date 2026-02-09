package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

record Stud(Integer id,String name,Integer marks) {
	
}

public class MapToIntMethod {
	public static void main(String[] args) {
  List<Stud> list = Arrays.asList(new Stud(101,"sritam",100),new Stud(101,"subrat",100));
  
  int i = list.stream().mapToInt(n-> n.marks()).sum();
  IO.println(i);
}
}