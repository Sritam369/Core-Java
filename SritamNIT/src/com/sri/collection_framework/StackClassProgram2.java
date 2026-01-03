package com.sri.collection_framework;

import java.util.Stack;

public class StackClassProgram2 {
 void main() {
	 Stack<String> s = new Stack<>();
	 s.push("Apple");
	 s.push("banana");
	 s.add("mango"); // we can add by add() or push() method in stack.
	 String fruit = s.peek();
	 IO.println("Element at top: "+fruit);
	 IO.println("stack elements are: "+s);
	 IO.println("Offset position is: "+s.search("mango"));
	 IO.println("Offset position is: "+s.search("banana"));
	 IO.println("Offset position is: "+s.search("grapes"));
	 IO.println("Index position is: "+s.indexOf("mango"));
 }
}
