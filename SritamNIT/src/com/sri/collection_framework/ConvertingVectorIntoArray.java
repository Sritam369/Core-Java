package com.sri.collection_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ConvertingVectorIntoArray {
  void main() {
	  Vector<String>listOfCity = new Vector<>();
	  listOfCity.add("surat");
	  listOfCity.add("mumbai");
	  listOfCity.add("pune");
	  listOfCity.add("kolkata");
	  
	  Collections.sort(listOfCity);
	  listOfCity.forEach(IO::println);
	  
	  Vector<Integer>listOfNum = new Vector<>();
	  listOfNum.add(10);
	  listOfNum.add(20);
	  listOfNum.add(30);
	  listOfNum.add(40);
	  
	  Collections.sort(listOfNum);
	  listOfNum.forEach(IO::println);
	  
	  Collections.sort(listOfNum,(l1,l2)-> Integer.compare(l2, l1));
	  listOfNum.forEach(IO::println);
	  
	  Vector<String>fruits = new Vector<>();
	  fruits.add("mango");
	  fruits.add("grapes");
	  fruits.add("banana");
	  
	  Object[]fruit = fruits.toArray();
	  IO.println(Arrays.toString(fruit));
  }
}
