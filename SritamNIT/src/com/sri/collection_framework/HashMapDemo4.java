package com.sri.collection_framework;

import java.util.HashMap;

record Emp(int id,String name) {
	
}

public class HashMapDemo4 {
  void main() {
	  Emp e1 = new Emp(101,"scott");
	  Emp e2 = new Emp(102,"pooja");
	  Emp e3 = new Emp(101,"scott");
	  Emp e4 = e2;
	  
	  HashMap<Emp,String> map = new HashMap<>();
	  map.put(e1, "Ameerpet");
	  map.put(e2, "S.R Nagar");
	  map.put(e3, "Begumpet");
	  map.put(e4, "Pnjagutta");
	  map.forEach((k,v)-> IO.println(k+" : "+v));
  }
}
