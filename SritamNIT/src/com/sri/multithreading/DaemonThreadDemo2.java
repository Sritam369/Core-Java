package com.sri.multithreading;

public class DaemonThreadDemo2 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
        System.out.println(main.isDaemon());
     
        Thread t1 = new Thread();
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
	}

}
