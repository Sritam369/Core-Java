package com.sri.collection_framework;

public class CustomLinkedList {
	private static class SinglyLinkedList{
		int item;
		SinglyLinkedList next;
		
		public SinglyLinkedList(int item) {
			this.item=item;
			this.next=null;
		}
	}
	
         void main() {
        	 SinglyLinkedList s1 = new SinglyLinkedList(100);
        	 SinglyLinkedList s2 = new SinglyLinkedList(200);
        	 SinglyLinkedList s3 = new SinglyLinkedList(300);
        	 
        	 // connecting the nodes in forward direction.
        	 s1.next=s2;
        	 s2.next=s3;
        	 IO.println(s1.item);
        	 IO.println(s1.next.item);
        	 IO.println(s1.next.next.item);
}
}
