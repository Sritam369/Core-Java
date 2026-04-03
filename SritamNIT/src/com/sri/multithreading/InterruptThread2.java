package com.sri.multithreading;

class Interrupts extends Thread
{
   @Override
   public void run()
    {
       Thread t = Thread.currentThread();
       System.out.println("Is thread interrupted : "+t.isInterrupted());
       
       for(int i=1; i<=5; i++)
        {
           System.out.println(i);  
           
                   try
           {
            Thread.sleep(1000);  //Java.lang.InterruptedException
                                 //interrupt flag value will become false
           }                    
           catch (InterruptedException e)
           {
               System.err.println(e);
               Thread.currentThread().interrupt(); // here again interrupt flag will become true
           }
           
        }
    }
}
public class InterruptThread2 {

	public static void main(String[] args) {
		Interrupts it = new Interrupts();
        System.out.println("Thread State is "+it.getState());  //NEW
        it.start();
        it.interrupt();

	}

}
