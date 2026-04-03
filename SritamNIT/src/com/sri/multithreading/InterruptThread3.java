package com.sri.multithreading;

class Interrupt2 extends Thread
{
   @Override
   public void run()
    {
       try
       {
        Thread.currentThread().interrupt(); //self interruption

       for(int i=1; i<=10; i++)
        {
           System.out.println("i value is :"+i);
           Thread.sleep(1000);
        }

       }
        catch (InterruptedException e)
        {
            System.err.println("Thread is Interrupted :"+e);
        }
        System.out.println("Child thread completed...");
    }
}
public class  InterruptThread3
{
    public static void main(String[] args)
    {    
        Interrupt2 it = new Interrupt2();
        it.start();    
    }
}

