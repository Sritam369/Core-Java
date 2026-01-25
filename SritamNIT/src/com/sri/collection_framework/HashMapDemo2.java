package com.sri.collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
  void main() {
	  HashMap<Integer,String> records = new HashMap<>();
	  records.put(101, "scott");
	  records.put(102, "smith");
	  records.put(103, "martin");
	  records.put(104, "aryan");
	  IO.println("Student Records : "+records);
	  
	  int searchId=105;
	  String name=records.get(searchId);
	  
	  if(name!=null) {
		  IO.println(name);
	  }
	  else {
		  IO.println("Student with id "+searchId+" not found");
	  }
	  
	  IO.println(records.put(103, "rahul"));
	  IO.println("Updated records: "+records);
	  
	  records.remove(104);
	  IO.println("Records after removal : "+records);
	  
	  int idToCheck = 101;
	  IO.println("Does ID "+idToCheck+" exist ? "+records.containsKey(idToCheck));
	  String nameToCheck = "scott";
	  IO.println("Does name "+nameToCheck+" exist ? "+records.containsValue(nameToCheck));
	  
	  IO.println("Iterating through record");
	  for(Map.Entry<Integer,String> entries : records.entrySet()) {
		  IO.println("ID: "+entries.getKey()+", Name: "+entries.getValue());
	  }
	  
	  records.clear();
	  IO.println("All students record deleted");
  }
}
