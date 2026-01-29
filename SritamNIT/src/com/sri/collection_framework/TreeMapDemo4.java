package com.sri.collection_framework;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo4 {
  void main() {
	  SortedMap<Integer,String> map = new TreeMap<>();
	  map.put(100, "amit");
	  map.put(101, "ravi");
	  map.put(102, "vijay");
	  map.put(103, "rahul");
	  IO.println("First Key: "+map.firstKey());
	  IO.println("Last Key: "+map.lastKey());
	  IO.println("headmap: "+map.headMap(102));
	  IO.println("tailmap: "+map.tailMap(102));
	  IO.println("submap: "+map.subMap(100,102));
  }
}
