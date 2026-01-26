package com.sri.collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
 void main() {
	 TreeSet<String> set = new TreeSet<>();
	 set.add("sritam");
	 set.add("jeevan");
	 set.add("subrat");	
	 set.add("vinay");
	 IO.println("Ascending order: "+set);
	 IO.println("Descending order: ");
	 Iterator<String> descItr = set.descendingIterator();
	 while(descItr.hasNext()) {
		 IO.println(descItr.next());
	 }
 }
}
