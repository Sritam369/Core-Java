package com.sri.collection_framework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LinkedListReplaceAllMethod {
 void main() {
	 LinkedList<String>list = new LinkedList<>();
	 list.addFirst("Ravi");
	 list.add("Sritam");
	 list.addLast("Subrat");
	 
	 IO.println(list.getFirst());
	 IO.println(list.getLast());
	 
	 list.removeFirst();
	 list.removeLast();
	 
	 list.forEach(y-> IO.println(y));
	 
//	 List<String>names=Arrays.asList("ravi","sritam");
//	 LinkedList<String>names2=new LinkedList<>(names);
	 
	 //UnaryOperator<String> convert = str->str.toUpperCase();
	 list.replaceAll(str->str.toUpperCase());
	 list.forEach(IO::println);
 }
}
