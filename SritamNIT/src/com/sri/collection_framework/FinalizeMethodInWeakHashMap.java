package com.sri.collection_framework;

import java.util.WeakHashMap;

record Humans(Integer id,String name) {
	public void finalize() {
		IO.println("The object is eligible for gc");
	}
}

public class FinalizeMethodInWeakHashMap {
	void main() throws InterruptedException {
		  Humans h = new Humans(101,"sritam");
		  WeakHashMap<Humans,String> map = new WeakHashMap<>();
		  map.put(h, "anadeula");
		  IO.println(map);
		  h=null;
		  System.gc();
		  Thread.sleep(3000);
		  IO.println(map);
	  }
}
