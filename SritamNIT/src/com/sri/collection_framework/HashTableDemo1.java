package com.sri.collection_framework;

import java.util.Hashtable;

// Hashtable will be executed from top to bottom and left to right in the bucket
public class HashTableDemo1 {
  void main() {
	  Hashtable<Integer,String> map = new Hashtable<>();
	  map.put(1, "priyanka");
	  map.put(2, "ruby");
	  map.put(3, "vibha");
	  map.put(4, "kanchan");
	  
	  map.putIfAbsent(5, "bina");
	  map.putIfAbsent(24, "pooja");
	  map.putIfAbsent(26, "ankita");
	  map.putIfAbsent(1, "sneha");
	  
	  IO.println(map);
  }
}
