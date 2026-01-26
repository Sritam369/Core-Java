package com.exam.nit;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMapEmployee {
	 void main(){
	     ArrayList<Emp>list=new ArrayList<>();
	     int size=Integer.parseInt(IO.readln("Enter size"));
	     for(int i=0;i<size;i++){
	        int id=Integer.parseInt(IO.readln("Enter id"));
	        String name=IO.readln("Enter name");
	        double sal=Double.parseDouble(IO.readln("Enter salary"));
	        list.add(new Emp(id,name,sal));
	     }
	     IO.println("=== Sorted Employee List (by ID) ===");
	     list.sort((e1,e2)-> Integer.compare(e1.id(),e2.id()));
	     list.forEach(IO::println);
	     IO.println();
	     IO.println("=== Converted Object Array ===");
	     Object[] arr = list.toArray();
	     IO.println(Arrays.toString(arr)); 
}
}
record Emp(int id,String name,double salary){
	  public String toString(){
	    return "Employee [id="+id+", name="+name+", salary="+salary+"]";
	  }
	}