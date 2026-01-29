package com.sri.collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo7 {
   void main() {
	   TreeSet<Integer> times = new TreeSet<>();
	   times.add(1205);
	   times.add(1505);
	   times.add(1545);
	   times.add(1600);
	   times.add(1830);
	   times.add(2010);
	   times.add(2100);
	   
	   SortedSet<Integer> sub = new TreeSet<>();
	   sub = times.subSet(1545, 2100);
	   IO.println("Using subSet() "+sub);
	   IO.println(sub.first());
	   IO.println(sub.last());
	   
	   sub = times.headSet(1545); // lesser elements than 1545
	   IO.println("Using headSet() "+sub);
	   sub = times.tailSet(1545); // equal or greater than 1545
	   IO.println("Using tailSet() "+sub);
   }
}
