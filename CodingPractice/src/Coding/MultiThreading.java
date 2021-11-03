package Coding;

public class MultiThreading extends Thread
{

    public void run()
    {
        try
        {
            System.out.println("Inside try of run method");
            System.out.println("Thread Running is" + Thread.currentThread().getName());
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }

    public static void  main(String args[])
    {
        int n = 8;
        for(int i =0; i < n; i++)
        {
            Thread multiThread = new Thread(new MultiThreading());
            multiThread.start();
        }
    }

}

class MultiThread extends MultiThreading
{
    public void run()
    {
       // super.run();
        try
        {
            System.out.println("Inside try of run method of MultiThread");
            System.out.println("Thread Running is MultiThread" + Thread.currentThread().getName());
        }
        catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
    public static void  main(String args[])
    {
        int n = 8;
        for(int i =0; i < n; i++)
        {
            //Thread multiThread = new Thread(new MultiThread());
            MultiThread mul = new MultiThread();
            MultiThreading mult = new MultiThread();
            mul.start();
            mult.start();


        }
    }

}
