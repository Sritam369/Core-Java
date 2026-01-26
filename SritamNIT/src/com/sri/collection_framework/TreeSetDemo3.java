package com.sri.collection_framework;

import java.util.TreeSet;

record Emp2(Integer id,String name) implements Comparable<Emp2>{
	public int compareTo(Emp2 e) {
		return this.name().compareTo(e.name());
	}
}

public class TreeSetDemo3 {
  void main() {
	  TreeSet<Emp2> ts = new TreeSet<>((e1,e2)-> e1.name().compareTo(e2.name()));
	  ts.add(new Emp2(101,"sritam"));
	  ts.add(new Emp2(102,"vinay"));
	  IO.println(ts);
  }
}
