package com.sri.collection_framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class StudentManagementSystem {
	void main() {
   HashMap<String,Double> map = new HashMap<>();
   
   while(true) {
   IO.println("=== Student Management Menu ===");
   IO.println("1. Add Student");
   IO.println("2. Update Marks");
   IO.println("3. Delete Student");
   IO.println("4. Search Student");
   IO.println("5. Display All Students");
   IO.println("6. Show Topper");
   IO.println("7. Show Lowest Scorer");
   IO.println("8. Show Total and Average Marks");
   IO.println("9. Exit");
     
   int choice = Integer.parseInt(IO.readln("Enter youer choice"));
   
   if(choice==1) {
	   String name = IO.readln("Enter student name");
	   double mark = Double.parseDouble(IO.readln("Enter student mark"));	   
	   map.put(name, mark);
	   IO.println("Student added successfully!");
   }
   else if(choice==2) {
	   String name = IO.readln("Enter student name to update marks");
	   double mark = Double.parseDouble(IO.readln("Enter student's new mark"));	
	   if(map.containsKey(name)) {
	   map.put(name, mark);
	   IO.println("Student mark updated");
	   }
	   else {
		   IO.println("Student with name "+name+" does not exist");
	   }
   }
   else if(choice==3) {
	   String name = IO.readln("Enter student name to delete");
	   if(map.containsKey(name)) {
	   map.remove(name);
	   IO.println("Student deleted");
	   }
	   else {
		   IO.println("Student with name "+name+" does not exist");
	   }
   }
   else if(choice==4) {
	   String name = IO.readln("Enter student name to search");
	   if(map.containsKey(name)) {
		 Double mark= map.get(name);
		 IO.println(name+" scored "+mark);
	   }
	   else {
		   IO.println("Student with name "+name+" does not exist");
	   }
   }
   else if(choice==5) {
	   IO.println("=== Student Records ===");
	   map.forEach((k,v)-> IO.println(k+" => "+v));
   }
   else if(choice==6) {
	   double mark = Collections.max(map.values());
	   for(Entry<String,Double> entry : map.entrySet()) {
		   if(entry.getValue()==mark) {
			   IO.println("Topper: "+entry.getKey() +" = > "+entry.getValue());
		   }
	   }	   
   }
   else if(choice==7) {
	  double mark = Collections.min(map.values());
	  for(Entry<String,Double> entry : map.entrySet()) {
		  if(entry.getValue()==mark) {
			  IO.println("Lowest Scorer: "+entry.getKey() +" = > "+entry.getValue());
		  }
	  }
   }
   else if(choice==8) {
	   Double sum =0.0;
	   int count=0;
	   for(Double value: map.values() ) {
		   sum+=value;
		   count++;
	   }
	   IO.println("Total Marks: "+sum);
	   Double avg = sum/count;
	   IO.println("Average Marks: "+avg);
   }
   else if(choice==9) {
	   IO.println("Exiting... Thank you!");
	   System.exit(0);
   }
   else {
	   IO.println("Invalid choice");
   }
  }
}
}