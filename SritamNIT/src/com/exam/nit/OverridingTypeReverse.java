package com.exam.nit;

import java.util.Scanner;

public class OverridingTypeReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		 String s = sc.nextLine();
		 System.out.println("enter Integer wrapper object");
	      Integer s2 = Integer.parseInt(sc.nextLine());
	      Type p;
	      p= new StringType(s);
	      p.reverse();
	      p= new IntegerType(s2);
	      p.reverse();

	}

}
abstract class Type{
    public abstract void reverse();
}
class StringType extends Type{
   public String str;
   public StringType(String str){
	   this.str=str;
   }
   public void reverse(){
    System.out.print("Reversed String: ");
    for(int i=str.length()-1;i>=0;i--){
    	System.out.print(str.charAt(i));
    }
    System.out.println();
   }
}
class IntegerType extends Type{
   public Integer str;
   public IntegerType(Integer str){
    this.str=str;
   }
   public void reverse(){
    System.out.print("Reversed Integer Digits: ");
    for(int i=str;i!=0;i/=10){
        System.out.print(i%10);
    }
   }

   }
   