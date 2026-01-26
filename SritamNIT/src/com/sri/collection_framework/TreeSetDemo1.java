package com.sri.collection_framework;

import java.util.TreeSet;

public class TreeSetDemo1 {
  void main() {
	  TreeSet<Object> set = new TreeSet<>();
	  set.add(12);
	//  set.add(null); NullpointerException
	  set.add("Ravi"); // ClassCastException
	  set.add(1);
	  set.add(9);
  }
}
