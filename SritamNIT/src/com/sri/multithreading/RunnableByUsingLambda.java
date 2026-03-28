package com.sri.multithreading;

public class RunnableByUsingLambda {
 void main() {
	 Runnable r1 = ()->{
		IO.println(Thread.currentThread().getName()+" is running"); 
	 };
	 Thread t = new Thread(r1);
	 t.start();
	 
	 // Lambda by using thread class constructor with ref
	 Thread t1 = new Thread(()->IO.println(Thread.currentThread().getName()));
	 t1.start();
	 
	 // Lambda by using thread class constructor without ref
	 new Thread(()->IO.println(Thread.currentThread().getName())).start();
	
 }
}
