package com.sri.collection_framework;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
   void main() {
	   HashMap<String,Integer>map=new HashMap<>();
	   map.put("java", 1);
	   map.put(new String("java"), 2);
	   IO.println(map.size()+" : "+map);
	   
	   IO.println("------------------");
	   
	   IdentityHashMap<String,Integer>map2=new IdentityHashMap<>();
	   map2.put("java", 1);
	   map2.put(new String("java"), 2);
	   IO.println(map2.size()+" : "+map2);
   }
}
