package com.sri.collection_framework;

import java.util.LinkedList;
import java.util.List;

public class InsertionAndDeletionWithLinkedList {
 void main() {
	 List<Integer>list=new LinkedList<>();
	 while(true) {
		 IO.println("1.add element");
		 IO.println("2.delete element");
		 IO.println("3.display element");
		 IO.println("4.exit");
		 
		 int choice = Integer.parseInt(IO.readln("Enter your choice"));
		 if(choice==1) {
			 int element = Integer.parseInt(IO.readln("insert an integer"));
			 list.add(element);
		 }
		 else if(choice==2) {
			 if(list.isEmpty()) {
				 IO.println("Nothing to delete. List is empty");
			 }
			 else {
				 int element=Integer.parseInt(IO.readln("enter integer to delete"));
				 boolean isPresent=false;
				 for(Integer lists:list) {
					 if(lists==element) {
						 list.remove(lists);
						 isPresent=true;
						 break;
					 }
				 }
				 if(!isPresent) {
					 IO.println("not deleted");
				 }
				 else {
					 IO.println("deleted");
				 }
			 }
		 }
		 else if(choice==3) {
			 IO.println(list);
		 }
		 else if(choice==4) {
			 System.exit(0);
		 }
		 else {
			 IO.println("invalid");
		 }
	 }
 }
}
