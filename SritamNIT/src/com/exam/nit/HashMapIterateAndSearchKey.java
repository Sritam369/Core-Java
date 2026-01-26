package com.exam.nit;

import java.util.HashMap;

public class HashMapIterateAndSearchKey {
	 void main(){
	        HashMap<Integer,String>list=new HashMap<>();
	        list.put(101,"Java");
	        list.put(102,"Python");
	        list.put(103,"C++");
	        
	        IO.println("HashMap Elements:");
	        list.forEach((keys,value)-> IO.println("Key: "+keys+", Value: "+value+""));
	        IO.println();
	        int key = Integer.parseInt(IO.readln("Enter key to search"));
	        if(list.containsKey(key)){
	            String value=list.get(key);
	            if(value!=null){
	                IO.println("Key found!");
	                IO.println("Value of key "+key+" is: "+list.get(key));
	            }
	        }
	        else{
           	 IO.println("Key not found!");
           }
	    }
	}
	            
	               
