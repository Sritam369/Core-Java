package com.sri.multithreading;

class Tatkals implements Runnable{

	@Override
	public void run() {
		IO.println(Thread.currentThread().getName()+" has booked tatkal ticket");		
	}
	
}
class PremiumTatkals implements Runnable{
	
	@Override
	public void run() {
		IO.println(Thread.currentThread().getName()+" has booked premium tatkal ticket");		
	}
	
}
public class ThreadGroupDemo2 {

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("tatkal");
		ThreadGroup tg2 = new ThreadGroup("premium tatkal");
		Thread t1 = new Thread(tg1,new Tatkals(),"sritam");
		Thread t2 = new Thread(tg1,new Tatkals(),"subrat");
		Thread t3 = new Thread(tg2,new PremiumTatkals(),"jeevan");
		Thread t4 = new Thread(tg2,new PremiumTatkals(),"tripati");
		t1.start();t2.start();t3.start();t4.start();
		
	}

}
