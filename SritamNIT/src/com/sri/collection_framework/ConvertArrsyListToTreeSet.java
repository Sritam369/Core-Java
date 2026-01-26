package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.TreeSet;

public class ConvertArrsyListToTreeSet {
  void main() {
	  ArrayList<Integer> list = new ArrayList<>();
	  list.add(12);
	  list.add(15);
	  list.add(20);
	  list.add(15);
	  IO.println("ArrayList: "+list);
	  
	  TreeSet<Integer> set = new TreeSet<>(list);
	  IO.println("Treeset: "+set);
  }
}
