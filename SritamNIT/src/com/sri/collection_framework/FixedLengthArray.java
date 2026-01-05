package com.sri.collection_framework;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//public static List<E> asList() method present in java.util.Arrays

public class FixedLengthArray {
  void main() {
	  List<Integer> num = Arrays.asList(1,2,3);
	  //num.add(4); // java.lang.UnsupportedOperationException
	  //num.remove(4); // java.lang.UnsupportedOperationException
	  num.set(0, 100);
	  IO.println(num);
	  IO.println("sorting the data");
	  num.sort((n1,n2)-> Integer.compare(n1, n2));
	  IO.println(num);
	  IO.println("Fetching in forward direction");
	  ListIterator<Integer> itr = num.listIterator();
	  while(itr.hasNext()) {
		  IO.print(itr.next());
	  }
	  IO.println();
	  IO.println("Fetching in backward direction");
	  
	  while(itr.hasPrevious()) {
		  IO.print(itr.previous());
	  }
  }
}
