package com.sri.collection_framework;

import java.util.Arrays;
import java.util.HashSet;

// Putting hashset in an array.
public class HashSetDemo2 {
  void main() {
	  Boolean values[] = new Boolean[6];
	  HashSet<Object> set = new HashSet<>();
	  values[0] = set.add(12);
	  values[1] = set.add(12);
	  values[2] = set.add("Java");
	  values[3] = set.add(new String("Java"));
	  values[4] = set.add(new StringBuffer("nit"));
	  values[5] = set.add(new StringBuffer("nit"));
	  
	 // add() method return type is boolean so it'll store the values as true/false in array.
	  
	  IO.println(Arrays.toString(values));
	  
	  IO.println("HashSet Elements");
	  set.forEach(IO::println);
  }
}
