package com.exam.nit;

import java.util.LinkedList;

public class FindingMiddleElementInLinkedList {
	  void main(){
	        LinkedList<Product>list=new LinkedList<>();
	        int size=Integer.parseInt(IO.readln("Enter size"));
	        if(size==0){
	            IO.println("X Catalog is empty!");
	            return;
	        }
	        for(int i=0;i<size;i++){
	            String id=IO.readln("Enter id");
	            String name=IO.readln("Enter name");
	            double price=Double.parseDouble(IO.readln("Enter salary"));
	        list.add(new Product(id,name,price));
	        }
	        IO.println("=== YOUR PRODUCT CATALOG ===");
	        IO.println("Middle Product:");
	        IO.println(list.get(size/2));
	    }
}
record Product(String id,String name,double price){
	   public String toString(){
	    return "Product [id="+id+", name="+name+", price="+price+"]";
	   }
	}