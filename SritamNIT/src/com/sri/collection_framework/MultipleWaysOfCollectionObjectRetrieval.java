package com.sri.collection_framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class MultipleWaysOfCollectionObjectRetrieval {
    void main() {
    	Vector <String> listOfCity = new Vector<String>();
    	listOfCity.add("Hyderabad");
    	listOfCity.add("Kolkata");
    	listOfCity.add("Pune");
    	listOfCity.add("Mumbai");
    	listOfCity.add("Indore");
    	
    	IO.println("by using toString method");
    	IO.println("..............................");
    	IO.println(listOfCity.toString());
    	IO.println();
    	
    	IO.println("by using for loop");
    	IO.println("..............................");
    for(int i=0;i<listOfCity.size();i++) {
    	IO.println(listOfCity.get(i));
    }
    	IO.println();
    	
    	IO.println("by using for-each loop");
    	IO.println("..............................");
    for(String list: listOfCity) {
    	IO.println(list);
    }
    	IO.println();
    	
    	IO.println("by using Enumeration interface");
    	IO.println("..............................");
    	Enumeration <String> elements = listOfCity.elements();
    while(elements.hasMoreElements()) {
    	 IO.println(elements.nextElement());
    }
    	IO.println();
    
    	IO.println("by using Iterator interface");
    	IO.println("..............................");
    	Iterator <String> element = listOfCity.iterator();
    while(element.hasNext()) {
    	 IO.println(element.next());
    }
    	IO.println();
    	
    	IO.println("by using List Iterator interface");
    	IO.println("..............................");
    	ListIterator <String> list = listOfCity.listIterator();
    	IO.println("In forward direction");
    while(list.hasNext()) {
    	 IO.println(list.next());
    }
    IO.println("In backward direction");
    while(list.hasPrevious()) {
    	 IO.println(list.previous());
    }
    	IO.println();
    	
    	IO.println("by using Spliterator interface");
    	IO.println("..............................");
    	Spliterator <String> split = listOfCity.spliterator();
    split.forEachRemaining(str-> IO.println(str));
    	IO.println();
    	
    	IO.println("by using for-each() method");
    	IO.println("..............................");
    listOfCity.forEach(city-> IO.println(city));
    	IO.println();
    	
    	IO.println("by using Method reference");
    	IO.println("..............................");
    	listOfCity.forEach(IO::println);
    	IO.println();
    	
    	IO.println("by using Stream() method");
    	IO.println("..............................");
    	listOfCity.stream().forEach(IO::println);
    	IO.println();
    	
    	IO.println("by using parallelStream() method");
    	IO.println("..............................");
    	listOfCity.parallelStream().forEach(IO::println);
    	IO.println();
    	    	
 }
}
