package com.sri.consumer_functional_interface;

import java.util.function.Consumer;

record Product(Integer id,String name , Double price) {}

public class Demo {

	public static void main(String[] args) {
		Consumer<Product> c1 = prod -> System.out.println("Product object "+prod);
		c1.accept(new Product(111,"laptop",96000.0));

	}

}
