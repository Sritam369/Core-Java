package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizationWithList {
   void main() {
	   ArrayList<String>cities = new ArrayList<>();
	   cities.add("balasore");
	   cities.add("keonjhar");
	   cities.add("kolkata");
	   
	   List<String> synchronizedList = Collections.synchronizedList(cities);
	   synchronizedList.forEach(IO::println);
   }
}
