package com.sri.stream_api;

import java.util.ArrayList;

record Student(String name,Double score,String status) {
	
}

public class TopPassingMarks {
  void main() {
	  ArrayList<Student> list = new ArrayList<>();
	  list.add(new Student("scott",79d,"pass"));
	  list.add(new Student("smith",55d,"fail"));
	  list.add(new Student("raj",80d,"pass"));
	  list.add(new Student("sritam",95d,"pass"));
	  list.add(new Student("daryll",20d,"fail"));
	  list.add(new Student("stark",29d,"fail"));
	  
	  list.stream().filter(stud->stud.score()>75).sorted((s1,s2)->s2.score().compareTo(s1.score())).map(stud->stud.name()).forEach(IO::println);
  }
}
