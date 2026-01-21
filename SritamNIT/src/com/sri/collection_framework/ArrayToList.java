package com.sri.collection_framework;

import java.util.ArrayList;
import java.util.List;

class Conversion{
	public static void convertToList(String[] inputArray) {
		List<String>list = new ArrayList<>();
		for(int i=0;i<inputArray.length;i++) {
			list.add(inputArray[i]);
		}
		IO.println(list.toString());
		IO.println(list.size());
	}
}

public class ArrayToList {
  void main() {
	  int size = Integer.parseInt(IO.readln("enter size"));
	  String arr[] = new String[size];
	  for(int i=0;i<size;i++) {
		  String value = IO.readln("enter value for "+i+" index");
		  arr[i]=value;
	  }
	  Conversion.convertToList(arr);
  }
}
