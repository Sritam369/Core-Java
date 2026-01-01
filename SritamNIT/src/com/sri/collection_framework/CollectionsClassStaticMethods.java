package com.sri.collection_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CollectionsClassStaticMethods {
  void main() {
	          Vector<Integer> v = new Vector<>();

	          int x[]={22,20,10,40,15,58};

	          //Adding array element into Vector
	          for(int i=0; i<x.length; i++)
	          {
	              v.add(x[i]);
	          }

	          Collections.sort(v);  //[old technique]

	          v.sort((i1, i2) -> i2-i1); //[new Technique]

	          v.forEach(y -> System.out.println(y));

	          System.out.println("Maximum element is :"+Collections.max(v));
	          System.out.println("Minimum element is :"+Collections.min(v));
	          System.out.println("Vector Elements :");

	          v.forEach(y -> System.out.println(y));

	          System.out.println(".......................");
	          Collections.reverse(v);
	          System.out.println("After reverse :");
	          v.forEach(y -> System.out.println(y));

	          //How to convert Collection to Array
	          Object[] array = v.toArray();
	          System.out.println(Arrays.toString(array));
	      
	  
  }
}
