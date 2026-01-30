package com.sri.collection_framework;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
   void main() {
	   PriorityQueue<Object> p = new PriorityQueue<>();
	   p.add("orange"); 
	   p.add("apple");
	   p.add("banana");
	   p.add(12); // classcastException
	   p.add(null); // npe
	   
   }
}
