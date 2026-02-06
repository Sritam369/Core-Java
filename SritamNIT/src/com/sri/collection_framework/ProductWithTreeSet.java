package com.sri.collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

record ProductWithTreeSet1(Integer pid, String pname)  {
    public ProductWithTreeSet1 {
    	try {
    	  if(pid<=0) {
    		  throw new IllegalArgumentException();
    	  }
    	}
    	catch(Exception e) {
    		IO.println("Pid must be positive");
    	}
    }
    
}

public class ProductWithTreeSet{
	public static void main(String[] args) {
		TreeSet<ProductWithTreeSet1> set = new TreeSet<>((p1,p2)-> Integer.compare(p1.pid(), p2.pid()));
		set.add(new ProductWithTreeSet1(103,"mobile"));
		set.add(new ProductWithTreeSet1(102,"laptop"));
		set.add(new ProductWithTreeSet1(101,"camera"));		
		IO.println(set);
		
		TreeSet<ProductWithTreeSet1> set2 = new TreeSet<>((p1,p2)-> Integer.compare(p2.pid(), p1.pid()));
		set2.add(new ProductWithTreeSet1(101,"mobile"));
		set2.add(new ProductWithTreeSet1(102,"laptop"));
		set2.add(new ProductWithTreeSet1(103,"camera"));	
		IO.println("pid in descending order "+set2);
		
		TreeSet<ProductWithTreeSet1> set3 = new TreeSet<>((p1,p2)-> p1.pname().compareTo(p2.pname()));
		set3.add(new ProductWithTreeSet1(101,"mobile"));
		set3.add(new ProductWithTreeSet1(102,"laptop"));
		set3.add(new ProductWithTreeSet1(103,"camera"));	
		IO.println(set3);
		
		TreeSet<ProductWithTreeSet1> set4 = new TreeSet<>((p1,p2)-> p2.pname().compareTo(p1.pname()));
		set4.add(new ProductWithTreeSet1(101,"mobile"));
		set4.add(new ProductWithTreeSet1(102,"laptop"));
		set4.add(new ProductWithTreeSet1(103,"camera"));	
		IO.println("pname in descending order "+set4);
	}
}