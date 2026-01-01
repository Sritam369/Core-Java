package com.sri.collection_framework;

import java.util.Vector;

public class VectorDemo1 {
	void main() {
   Vector<Integer> v = new Vector<>(100,20);
   IO.println("Initial capacity is: "+v.size());
   
   for(int i=1;i<=100;i++) {
	   v.add(i);
   }
   IO.println("after adding 100 elements: "+v.size());
   v.add(101);
   IO.println("after adding 101 elements: "+v.size());
   
   for(Integer vector:v) {
	   if(vector%5==0) {
		   IO.println();
	   }
	   IO.println(vector);
   }
}
}