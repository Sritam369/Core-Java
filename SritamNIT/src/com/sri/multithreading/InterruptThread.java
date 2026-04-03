package com.sri.multithreading;

class Interrupt extends Thread
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
           }
           
        }
    }
}
public class  InterruptThread
{
    public static void main(String[] args)
    {
        Interrupt it = new Interrupt();
        System.out.println("Thread State is "+it.getState());  //NEW
        it.start();
        it.interrupt();  //main thread is interrupting the child thread
                         //interrupt flag value will become true
    }
}
