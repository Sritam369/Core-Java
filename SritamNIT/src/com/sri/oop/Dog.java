package com.sri.oop;

public class Dog {
   String name;
   double height;
   int age;
   public void getDogInfo() {
	   System.out.println("Dog Name is "+name);
	   System.out.println("Dog height is "+height);
	   System.out.println("Dog age is "+age);
   }
   public void bark() {
	   System.out.println("I bark at strangers");
   }
}
