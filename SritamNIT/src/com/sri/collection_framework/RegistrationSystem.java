package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegistrationSystem {
  void main() {
	 HashMap<String,List<String>> map = new HashMap<>();
	 
	 while(true) {
	 IO.println("===== Course Registration Menu =====");
	 IO.println("1. Register student to course");
	 IO.println("2. Remove student from course");
	 IO.println("3. View course-wise students");
	 IO.println("4. Exit");
	 
	 int choice=Integer.parseInt(IO.readln("Enter your choice"));
	 
	 if(choice==1) {
		 String course = IO.readln("Enter course name");
		 String student = IO.readln("Enter student name");
		 map.computeIfAbsent(course, key-> new<String>ArrayList()).add(student);
	 }
	 else if(choice==2) {
		 String course = IO.readln("Enter course name");
		 String student = IO.readln("Enter student name");
		 if(map.containsKey(course)) {
		 map.computeIfPresent(course, (k,v)-> {
			 if(v.equals(student)) {
		 v.remove(student);
			 }
			 else {
				 IO.println("Student with name "+student+" not found");
			 }
		 return v;
		 });
		 }
		 else {
			 IO.println(course+" course not found");
		 }
	 }
	 else if(choice==3){
		 map.forEach((k,v)-> IO.println("Course: "+k+" Student name: "+v));
	 }
	 else if(choice==4) {
		 IO.println("You exited the menu");
		 return;
	 }
	 else {
		 IO.println("Invalid choice");
	 }
  }
  }}
