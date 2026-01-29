package com.sri.collection_framework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
  void main() {
	  NavigableSet<Integer> ns = new TreeSet<>();
	  ns.add(1);
	  ns.add(2);
	  ns.add(3);
	  ns.add(4);
	  ns.add(5);
	  ns.add(6);
	  
	  IO.println("lower(3): "+ns.lower(3)); // just below 3
	  IO.println("floor(3): "+ns.floor(3)); // equal,less or null
	  IO.println("higher(3): "+ns.higher(3)); // just greater than 3
	  IO.println("ceiling(3): "+ns.ceiling(3)); // equal/greater/null
	  
  }
}
