package com.sri.collection_framework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo3 {
  void main() {
	  LinkedList<String> list = new LinkedList<>();
	  list.add("item 2"); // 2
	  list.add("item 3"); // 3
	  list.add("item 4"); // 4
	  list.add("item 5"); // 5
	  list.add("item 6"); // 6
	  list.add("item 7"); // 7
	  
	  list.add("item 9"); //10
	  
	  list.add(0,"item 0"); //0
	  list.add(1,"item 1"); //1
	  
	  list.add(8,"item 8"); //8
	  list.add(9,"item 10"); //9
	  
	  IO.println(list);
	  
	  list.remove("item 5");
	  IO.println(list);
	  
	  list.removeLast();
	  IO.println(list);
	  
	  list.removeFirst();
	  IO.println(list);
	  
	  list.set(0, "ajay");
	  list.set(1, "vijay");
	  list.set(2, "anand");
	  list.set(3, "aman");
	  list.set(4, "suresh");
	  list.set(5, "ganesh");
	  list.set(6, "ramesh");
	  list.forEach(x -> IO.println(x));
	  
	  ListIterator<String>listItr = list.listIterator();
	  IO.println("Previous Index "+listItr.previousIndex());
	  IO.println("Next Index "+listItr.nextIndex());
	  
	  while(listItr.hasNext()) {
		  String data = listItr.next();
		  int index = listItr.nextIndex();
		  IO.println("Object at "+(index-1)+" index : "+data);
	  }
	  
  }
}
