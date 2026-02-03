package com.sri.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
  void main() {
	  List<String>list = List.of("Aryan","Ankita","Raj","Rohit","Aniket","Raj","Aryan","Ajinkya","Ankit");
	  list.stream().filter(name -> name.startsWith("A")).collect(Collectors.toSet()).forEach(IO::println);;
	  
  }
}
