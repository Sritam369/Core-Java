package com.sri.collection_framework;

import java.util.HashMap;

//record Customerss(int id,String name) {
//	
//}
class Customerss{
	int id;
	String name;
	public Customerss(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customerss [id=" + id + ", name=" + name + "]";
	}
	public boolean equals(Object obj) {
		if(obj instanceof Customerss c) {
			if(this.id==c.id && this.name.equals(c.name)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			IO.println("Object not comparable");
			return false;
		}
	}
	public int hashCode() {
		return this.id;
	}

}

public class HashMapDemo1 {
  void main() {
	  Customerss c1 = new Customerss(111,"scott");
	  Customerss c2 = new Customerss(111,"scott");
	  HashMap<Customerss,String>map=new HashMap<>();
	  map.put(c1, "hyd");
	  map.put(c2, "bls");
	  IO.println(map.size());
	  IO.println(map);
  }
}
