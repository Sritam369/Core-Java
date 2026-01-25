package com.sri.collection_framework;

import java.util.HashMap;

public class HashMapFrequencyCount {
  void main() {
	  String text = "java is fun, java is powerful, java is great";
	  String words[] = text.split(" ");
	  
	  HashMap<String,Integer> map = new HashMap<>();
	  for(String word : words) {
		  map.put(word, map.getOrDefault(word, 0)+1);
	  }
	  
	  IO.println("Word Frequency: "+map);
  }
}
