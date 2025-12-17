package com.sri.function_functional_interface;

import java.util.function.Function;

record Product(Integer id,String name,Double price) {}

public class CalculateProductDiscount {

	public static void main(String[] args) {
		int id = Integer.parseInt(IO.readln("Enter product id : "));
        String name = IO.readln("enter product name : ");
        double price = Double.parseDouble(IO.readln("Enter product price : "));
        Product p = new Product(id,name,price);
        
        Function<Product,Double> discount = prod ->{ 
        	if(prod.price()>=5000) {
        		return prod.price()-(prod.price()*10/100); 
        	}
        	else {
        		return prod.price()-(prod.price()*5/100);
        	}        
        };
        
        IO.println("Final price of the product is : "+discount.apply(p));
	}

}
