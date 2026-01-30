package com.sri.collection_framework;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
  void main() {
	  PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
	  p.add(12);
	  p.add(25);
	  p.add(30);
	  
	  while(!p.isEmpty()) {
		  IO.println(p.poll());
	  }
	  
	  IO.println(p.isEmpty());
  }
  
}
