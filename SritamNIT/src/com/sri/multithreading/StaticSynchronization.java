package com.sri.multithreading;

class Table2{
	public static synchronized void printTable(int num) {
		for(int i=1;i<=10;i++) {
			IO.println(i*num);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Table2.printTable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Table2.printTable(6);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				Table2.printTable(7);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				Table2.printTable(8);
			}
		};
		t1.start();t2.start();t3.start();t4.start();
	}

}
