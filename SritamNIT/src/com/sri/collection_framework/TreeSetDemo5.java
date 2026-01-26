package com.sri.collection_framework;

import java.util.TreeSet;

record Student4(Integer id,String name)  {

}

public class TreeSetDemo5 {
	void main() {
   TreeSet<Student4> ts = new TreeSet<>((s1,s2)->s1.id().compareTo(s2.id()));
   ts.add(new Student4(111,"scott"));
   ts.add(new Student4(222,"scott"));
   ts.add(new Student4(333,"scott"));
   ts.forEach(IO::println); 
}
}