package com.sri.collection_framework;

import java.util.Vector;

public class ToDoMEnuProgramWithVectorClass {
   void main() {
	   Vector<String> list = new Vector<>();
	   IO.println("1. add task");
	   IO.println("2. view task");
	   IO.println("3. remove task");
	   IO.println("4. exit");
	   int choice=0;
	   while(choice!=4) { 
		    choice=Integer.parseInt(IO.readln("enter your choice"));
	   if(choice==1) {
		   
		   String task = IO.readln("enter task");
		  
		   list.add(task);
		   IO.println("task added successfully");
		   
	   }
	   else if(choice==2) {
		   for(int i=0;i<list.size();i++) {	   
			   IO.println((i+1) +"."+list.get(i));
		   }
	   }
	    else if(choice==3) {
	    	for(int i=0;i<list.size();i++) {	   
	    		int removeTask = Integer.parseInt(IO.readln("enter which number task do you want to remove"));
	    		if(removeTask>=1 && removeTask<=list.size()) {
			String complete=list.remove(removeTask-1);
			IO.println("Task marked as complete: "+complete);
	    		}
	    		else {
	    			IO.println("Invalid task number");
		   }  
		   }
	   }
	    else if(choice==4) {
	    	System.exit(0);
	    }
	    else {
	    	IO.println("Invalid choice");
	    	
	    }
	   }
   }
}
