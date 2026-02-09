package com.sri.multithreading;

class Sample extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			IO.println(i+" by "+name+" thread");
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		new Sample().start();
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			IO.println(i+" by "+name+" thread");
		}
		
		int x=1;
		do {
			IO.println("India");
			x++;
		}
		while(x<=10);
	}

}
