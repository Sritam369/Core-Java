package com.exam.nit;

import java.util.Scanner;

public class OverrideInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		        String s = sc.nextLine();
		        String s1 = s.toUpperCase();
		       Super s2 = new Super(s1);
		       s2.display();
		       String s3 = s.replace(" ","_");
		       String s5 = s3.toLowerCase();
		       Sub s4 = new Sub(s1,s5);
		       s4.display();
		       sc.close();
		    }
		}
class Super {

String str;
 public Super(String str){
 this.str=str;
 }
 public void display(){
System.out.println("Superclass processing: "+str);
 }
	}
class Sub extends Super{
    String str2;
    public Sub(String str,String str2){
        super(str);
        this.str2=str2;
    }
    public void display(){  
    	System.out.println("Subclass processing: "+str2);
    }
}
