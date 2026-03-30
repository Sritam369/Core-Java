package com.sri.multithreading;

class Table{
	public synchronized void printTable(int num) {
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

public class MethodLevelSynchronization {

	public static void main(String[] args) {
		Table t = new Table();
		Thread t1 = new Thread(){
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				t.printTable(6);
			}
		};
         t1.start();
         t2.start();
	}

}
