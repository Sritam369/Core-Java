package com.sri.collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {
 void main() {
	 HashMap<Integer,String> map1 = new HashMap<>();
	 HashMap<Integer,String> map2 = new HashMap<>();
	 
	 map1.put(1, "OCPJP");
	 map1.put(2, "is");
	 map1.put(3, "best");
	 
	 IO.println("Values in map1 : "+map1);
	 
	 map2.put(4, "exam");
	 IO.println("Values in map2 : "+map2);
	 
	 IO.println("After using putAll()");
	 map1.putAll(map2);
	 IO.println("Values in map1 : "+map1);
	 
	 IO.println("All the keys are:");
	 Set<Integer> keys = map1.keySet();
	  IO.println(keys);
	  
	  IO.println("All the values are:");
	  Collection<String> values = map1.values();
	  IO.println(values);
	  
	  // Loose Coupling
	  HashMap<Integer,String> map3 = new HashMap<>(map1);
	  IO.println(map3);
 }
}
