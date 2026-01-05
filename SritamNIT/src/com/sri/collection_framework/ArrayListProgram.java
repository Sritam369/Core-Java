package com.sri.collection_framework;

import java.util.ArrayList;

public class ArrayListProgram {
	void main() {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    int sum = 0;
    for(int i=0;i<numbers.size();i++) {
    	sum+=numbers.get(i);
    }
    IO.println("Sum is: "+sum);
}
}