package com.sri.collection_framework;

import java.util.Comparator;
import java.util.TreeSet;

record Student3(Integer id,String name) implements Comparator<Student3> {
	public int compare(Student3 s1, Student3 s2) {
		return Integer.compare(s1.id(), s2.id());
	}
}

public class TreeSetDemo4 {
	void main() {
   TreeSet<Student3> ts = new TreeSet<>();// ClassCastException because if we don't provide comparator in constructor then it by default try to sort the elements by calling Comparable
   ts.add(new Student3(111,"scott"));
   ts.add(new Student3(222,"scott"));
   ts.add(new Student3(333,"scott"));
   ts.forEach(IO::println); 
}
}