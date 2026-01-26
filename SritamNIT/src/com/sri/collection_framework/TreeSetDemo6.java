package com.sri.collection_framework;

import java.util.TreeSet;

// StringBuffer and StringBuilder both implement Comparable from 11v

public class TreeSetDemo6 {
   void main() {
	   TreeSet<StringBuffer> set = new TreeSet<>((s1,s2)-> s2.compareTo(s1));
	   set.add(new StringBuffer("B"));
	   set.add(new StringBuffer("A"));
	   set.add(new StringBuffer("C"));
	   set.forEach(IO::println);
	   
	   TreeSet<StringBuilder> set2 = new TreeSet<>();
	   set2.add(new StringBuilder("B"));
	   set2.add(new StringBuilder("A"));
	   set2.add(new StringBuilder("C"));
	   set2.forEach(IO::println);
   }
}
