package com.sri.collection_framework;

import java.util.TreeMap;

public class TreeMapDemo1 {
  void main() {
	  TreeMap<Object,String> map = new TreeMap<>();
	  map.put("ravi", "hyd");
	  map.put(null,"hyd"); // NullPointerException
	  map.put(123,"hyd"); // ClasssCastException
	  
	  IO.println(map);
  }
}
