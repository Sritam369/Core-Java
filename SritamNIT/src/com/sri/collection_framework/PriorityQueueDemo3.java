package com.sri.collection_framework;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
	public static void main(String[] args) {
	 PriorityQueue<Integer> p = new PriorityQueue<>();
	 int choice;
	 
	 do {
		 IO.println("=== PriorityQueue menu ===");
		 IO.println("1. insert element");
		 IO.println("2. remove head element");
		 IO.println("3. view head element");
		 IO.println("4. display elements");
		 IO.println("5. exit");
		 
		 choice = Integer.parseInt(IO.readln("Enter your choice"));
		 
		 switch(choice) {
		 case 1: int val = Integer.parseInt(IO.readln("Enter element to insert"));
		 p.add(val);
		 IO.println(val+" inserted");
		 break;
		 
		 case 2: if(p.isEmpty()) {
			 IO.println("PriorityQueue is empty");
		 }
		 else {
			 IO.println("Removed: "+p.poll());
		 }
		 break;
		 case 3: if(p.isEmpty()) {
			 IO.println("PriorityQueue is empty");
		 }
		 else {
			 IO.println("Head element: "+p.peek());
		 }
		 break;
		 case 4: IO.println("PriorityQueue: "+p);
		 break;
		 
		 case 5: IO.println("Exiting...");
		 break;
		 
		 default: IO.println("Invalid choice");
		 }
		 
	 }
	 while(choice!=5);
 }
}
