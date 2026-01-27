package com.sri.collection_framework;

import java.util.HashMap;

record Human(Integer id,String name) {
	public void finalize() {
		IO.println("The object is eligible for gc");
	}
}

public class FinalizeMethodInHashMap {
  void main() throws InterruptedException {
	  Human h = new Human(101,"sritam");
	  HashMap<Human,String> map = new HashMap<>();
	  map.put(h, "anadeula");
	  IO.println(map);
	  h=null;
	  Thread.sleep(3000);
	  System.gc();
	  IO.println(map);
  }
}
