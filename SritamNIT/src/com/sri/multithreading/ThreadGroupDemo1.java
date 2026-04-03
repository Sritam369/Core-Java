package com.sri.multithreading;

class Target implements Runnable{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			IO.println(name+" is running for "+i+" time");
		}
				
	}
	
}
public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("batch-1");
		
		Thread t1 = new Thread(tg,new Target(),"child1");
		Thread t2 = new Thread(tg,new Target(),"child2");
		Thread t3 = new Thread(tg,new Target(),"child3");
		
		t1.start();t2.start();t3.start();
		
		IO.println("Group name is : "+tg.getName());
		IO.println("Total thread count is : "+tg.activeCount());

	}

}
