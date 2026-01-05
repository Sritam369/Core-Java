package com.sri.collection_framework;

import java.util.ArrayList;

public class ArrayListProgram3 {
  void main() {
	  ArrayList<String> al1 = new ArrayList<>();
	  al1.add("sritam");
	  al1.add("subrat");
	  al1.add("jeevan");
	  
	  ArrayList<String> al2 = new ArrayList<>();
	  al2.add("sritam");
	  al2.add("subrat");
	  al2.add("jeevan");
	  
	  al1.addAll(al2);
	  IO.println("size of al1: "+al1.size());
	  IO.println("size of al2: "+al2.size());
	  IO.println("is al2 empty: "+al2.isEmpty());
	  al1.forEach(str-> IO.println(str.toUpperCase()));
	  
	  ArrayList<String> al3 = new ArrayList<>();
	  al3.add("sritam");
	  al3.add("subrat");
	  al3.add("jeevan");
	  
	  ArrayList<String> al4 = new ArrayList<>();
	  al4.add("sritam");
	  al4.add("subrat");
	  al4.add("vinay");
	  
	  al3.retainAll(al4);
	  al3.forEach(IO::println);
  }
}
