package com.sri.generics;

import java.util.ArrayList;

class WildCard {	
   void main() {
	 ArrayList<?>list=new ArrayList<Integer>();
	 ArrayList<? extends Number>list2=new ArrayList<Integer>();
	 //list2.add(15); invalid in upper bound
	 ArrayList<? super Integer>list3=new ArrayList<Number>();
	 list3.add(15); // valid in lower bound
   }
}
