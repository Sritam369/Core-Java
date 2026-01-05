package com.sri.collection_framework;

import java.util.List;

//static <E> List<E> of(E e1,E e2,E e3,E e4,E e5)

public class ImmutableList {
   void main() {
	   List<Integer>list=List.of(1,2,3);
	 //num.add(4); // java.lang.UnsupportedOperationException
	 //num.remove(4); // java.lang.UnsupportedOperationException
	 // num.set(0, 100); // java.lang.UnsupportedOperationException
   }
}
