package com.sri.collection_framework;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackClassProgram {
  void main() {
	  try {
	  Stack<Integer> s = new Stack<>();
	  s.push(12);
	  s.push(13);
	  s.push(14);
	  s.push(15);
	  IO.println("After insertion: "+s);
	  
	  IO.println("Offset position element: "+s.peek());
	  IO.println("Fetching the element with deleting them: ");
	  IO.println(s.pop());
	  IO.println(s.pop());
	  IO.println(s.pop());
	  IO.println(s.pop());
	  //IO.println(s.pop());
	  
	  IO.println("after deletion :"+s);
	  IO.println("is the stack empty ? "+s.empty());
	  }
	  catch(EmptyStackException e) {
		  e.printStackTrace();
	  }
  }
}
