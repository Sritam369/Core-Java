package com.sri.collection_framework;
import java.util.TreeMap;

record Productss2(Integer id,String name) {
	
}

public class TreeMapDemo3 {
void main() {
	TreeMap<Productss2,String> map = new TreeMap<>((p1,p2)-> p2.id().compareTo(p1.id()));
	   map.put(new Productss2(101,"mobile"),"hyd");	  
	   map.put(new Productss2(102,"laptop"),"chennai");
	   map.put(new Productss2(103,"camera"),"mumbai");
	   IO.println(map);
	   }
}
