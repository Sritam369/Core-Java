package com.sri.multithreading;

class Tes extends Thread{
	
	private int data = 0;
	public void run() {
		for(int i=1;i<=10;i++) {
			
			this.data+=i;
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public int getData() {
		return this.data;
	}
}
public class ITCDemo1 {

	public static void main(String[] args) {
		Tes t1 = new Tes();
		t1.start();
		
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		IO.println(t1.getData());

	}

}
