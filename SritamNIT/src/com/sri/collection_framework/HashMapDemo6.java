package com.sri.collection_framework;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo6 {
  void main() {
	  HashMap<String,Integer> flights = new HashMap<>();
	  flights.put("Mumbai", 5500);
	  flights.put("Bangalore", 7000);
	  flights.put("Chennai", 6500);
	  flights.put("Vizag", 5000);
	  
	  Iterator<Entry<String,Integer>> itr = flights.entrySet().iterator();
	  while(itr.hasNext()) {
		  Entry<String,Integer> entries = itr.next();
		  if(entries.getValue()>=7000) {
			  IO.println(entries.getKey());
		  }
	  }
	  
	  // Cheapest flight rate
	  Entry<String,Integer> entry = Collections.min(flights.entrySet(), (f1,f2)-> Integer.compare(f1.getValue(),f2.getValue()));
	  IO.println("Cheapest flight rate is : "+entry.getValue());
	  
	  // Expensive flight rate
	  Entry<String,Integer> entry2 = Collections.max(flights.entrySet(), (f1,f2)-> Integer.compare(f1.getValue(),f2.getValue()));
	  IO.println("Expensive flight rate is : "+entry2.getValue());
  }
}
