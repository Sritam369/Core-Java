package com.sri.collection_framework;

import java.util.Vector;
import java.util.function.Consumer;

public class InternalWorkingOfForEachMethod {
  void main() {
	Vector <String> listOfCity = new Vector<String>();
    	listOfCity.add("Hyderabad");
    	listOfCity.add("Kolkata");
    	listOfCity.add("Pune");
    	listOfCity.add("Mumbai");
    	listOfCity.add("Indore");
    // anonymous inner class	
    	Consumer<String> consumer = new Consumer<String>() {
    		public void accept(String city) {
    			IO.println(city);
    		}
    	};
    	listOfCity.forEach(consumer);
    	
    	// lambda expression
    	Consumer<String> con = city -> IO.println(city);
    	listOfCity.forEach(con);
    	
    	// passing lambda as an argument to Functional interface parameter
    	listOfCity.forEach(city->IO.println(city));
  }
}
