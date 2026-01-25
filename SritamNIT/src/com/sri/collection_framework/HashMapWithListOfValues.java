package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapWithListOfValues {
  void main() {
	  HashMap<String, List<String>> subjects = new HashMap<>();
	  subjects.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Java");
	  subjects.computeIfAbsent("Scott", key -> new ArrayList<String>()).add("Adv Java");
	  subjects.computeIfAbsent("Smith", key -> new ArrayList<String>()).add("HTML");
	  subjects.computeIfAbsent("Smith", key -> new ArrayList<String>()).add("JavaScript");
	  
	  IO.println(subjects);
	  
	  // Adding more subjects with computeIfPresent()
	  subjects.computeIfPresent("Scott", (k,v)-> {
	    v.add("Spring");
	    return v;
	  });
	  
	  IO.println(subjects);
	  
	  
  }
}
