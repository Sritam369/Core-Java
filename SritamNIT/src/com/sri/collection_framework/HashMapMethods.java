package com.sri.collection_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapMethods {
  void main() {
	  HashMap<Integer,String>map=new HashMap<>();
	  map.put(1, "vanilla");
	  map.put(2, "butterscotch");
	  map.put(3, "chocolate");
	  map.put(4, "cotton candy");
	  
	  IO.println(map);
	  IO.println("By using forEach method");
	  map.forEach((k,v)-> IO.println("key is "+k+" value is "+v));
	  String iceCream=map.get(4);
	  IO.println(iceCream);
	  String iceCream2=map.getOrDefault(5, "not available");
	  IO.println(iceCream2);
	  boolean hasKey=map.containsKey(3);
	  IO.println("HashMap has key 3 :"+hasKey);
	  boolean hasValue=map.containsValue("vanilla");
	  IO.println("HashMap has value vanilla :"+hasValue);
	  map.remove(3);
	  IO.println("after removing one key "+map);
	  IO.println(map.size());
	  
	  IO.println("Iterating through iterator");
	  Iterator<Entry<Integer,String>> itr= map.entrySet().iterator();
	  itr.forEachRemaining(IO::println);
	  
	  
	  IO.println("Iterating through hashmap");
	  for(HashMap.Entry<Integer,String> entry : map.entrySet()) {
		  IO.println("Key is : "+entry.getKey()+" Value is :"+entry.getValue());
	  }
	  map.clear();
  }
}
