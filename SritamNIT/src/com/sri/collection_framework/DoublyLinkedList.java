package com.sri.collection_framework;

import java.util.LinkedList;

public class DoublyLinkedList {
  void main() {
	  LinkedList<String> l = new LinkedList<>();
	  l.add("java"); // here internally Node n1 = new Node(prev,item,next) is creating
	  l.add("c");
	  l.add("react");
	  IO.println(l);
  }
}