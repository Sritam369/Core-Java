package com.sri.collection_framework;
import java.util.TreeMap;

record Productss(Integer id, String name) implements Comparable<Productss>{
	public int compareTo(Productss p2) {
		return this.id().compareTo(p2.id());
	}
}

public class TreeMapDemo2 {
 void main() {
  TreeMap<Productss,String> map = new TreeMap<>();
   map.put(new Productss(101,"mobile"),"hyd");	  
   map.put(new Productss(102,"laptop"),"chennai");
   map.put(new Productss(103,"camera"),"pune");
   IO.println(map);
   }
}
