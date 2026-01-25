package com.sri.collection_framework;

import java.util.LinkedList;

public class LinkedListDemo1 {
  void main() {
	  LinkedList<String> list=new LinkedList<>();
	  list.add("Coach A");
	  list.add("Coach B");
	  list.add("Coach C");
	  
	  IO.println("Initial train: "+list);
	  
	  list.addFirst("Engine");
	  IO.println("After adding Engine in front "+list);
	  list.addLast("Guard coach");
	  IO.println("After adding Guard coach in end "+list);
	  list.add(2,"Pantry coach");
	  IO.println("After adding Pantry coach in middle "+list);
	  
	  list.removeFirst();
	  list.removeLast();
	  list.remove(1);
	  
	  IO.println("After reaching destination "+list);
  }
}
