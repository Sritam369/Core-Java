package com.sri.collection_framework;

import java.util.HashMap;

public class HashMapDemo5 {
	void main() {
  HashMap<String,Boolean> map = new HashMap<>();
  map.put("core java",true);
  map.put("adv java",true);
  map.put("HTML",false);
  map.put("javaScript",true);
  
  IO.println("Initial library status : "+map);
  String bookToBorrow = "adv java";
  if(map.containsKey(bookToBorrow) && map.get(bookToBorrow)) {
	  map.put(bookToBorrow,false);
	  IO.println("You can take the book "+bookToBorrow+"");	  
  }
  else {
	  IO.println(bookToBorrow+" book is already boorowed");
  }
  IO.println("library status after borrowing the book : "+map);
  String bookToReturn = "HTML";
  if(map.containsKey(bookToBorrow) && !map.get(bookToBorrow)) {
	  map.put(bookToReturn,true);
	  IO.println("Thank you for returning "+bookToBorrow+" book");	  
  }
  else {
	  IO.println(bookToReturn+" book is not in the library");
  }
  IO.println("library status after returning the book");
  
  for(HashMap.Entry<String,Boolean> entry: map.entrySet()) {
	  String status = entry.getValue() ? "Available" : "Borrowed";
	  IO.println("Book: "+entry.getKey()+", Status: "+status);
  }
}
}