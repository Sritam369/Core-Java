package com.sri.exception_handling;

class Product implements Cloneable{
	int id;
	String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class CloneNotSupportedExceptionDemo {
   void main() {
	   try {
	   Product p1 = new Product(111,"mobile");
	   Product p2 = (Product)p1.clone();
	   IO.println("Before change");
	   IO.println(p1+" : "+p2);
	   p2.setId(222);
	   p2.setName("book");
	   IO.println("after change");
	   IO.println(p1+" : "+p2);
	   }
	   catch(CloneNotSupportedException e) {
		   e.printStackTrace();
	   }
   }
}
