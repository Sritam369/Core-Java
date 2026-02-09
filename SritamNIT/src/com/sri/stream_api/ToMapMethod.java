package com.sri.stream_api;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

record Customer55(Integer id,String name,Double bill) {
	
}

public class ToMapMethod {
  public static void main(String[] args) {
	  ArrayList<Customer55> list = new ArrayList<>();
	  list.add(new Customer55(101,"sri",25000d));
	  list.add(new Customer55(102,"sub",35000d));
	  list.add(new Customer55(103,"jeevi",45000d));
	  list.add(new Customer55(103,"jeevi",45000d));
	  
//	 Map<Integer,String> map =  list.stream().collect(Collectors.toMap(cust-> cust.id(), cust2-> cust2.name()));
//	  IO.println(map); // IllegalStateException due to duplicate key(103)
	  
	  Map<Integer,String> map2 =  list.stream().collect(Collectors.toMap(cust-> cust.id(), cust2-> cust2.name(),(oldKey,NewKey)->NewKey));
	  IO.println(map2); // no exception due to merge method which takes biFunction
	  
	  Map<Integer,String> map3 =  list.stream().collect(Collectors.toMap(cust-> cust.id(), cust2-> cust2.name(),(oldKey,NewKey)->NewKey, LinkedHashMap::new));
	  IO.println(map3); // ordered 
	  }
}
