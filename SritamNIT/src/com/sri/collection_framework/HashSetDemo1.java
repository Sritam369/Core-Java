package com.sri.collection_framework;

import java.util.HashSet;

public class HashSetDemo1 {
 void main() {
	 HashSet<Object>hs=new HashSet<>();
	 hs.add(12);
	 hs.add(12);
	 hs.add("java");
	 hs.add(new String("java"));
	 IO.println(hs);
	 hs.remove(12);
	 IO.println("a"+hs);
 }
}
