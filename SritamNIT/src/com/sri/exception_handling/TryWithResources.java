package com.sri.exception_handling;

import java.util.Scanner;

public class TryWithResources {
    void main() {
    	 Scanner sc = new Scanner(System.in);
    	  try(sc){   		  
    		  System.out.println("enter a number");
    		  int a = sc.nextInt();		  
    		  a = 10/a;
    		  IO.println(a);
    	  }
    	  catch(Exception e) {
    		  IO.println(e);
    	  }
    }
}
