package Threadsss;
import java.lang.Thread; 

class RunnableDemo implements Runnable
{private Thread thread;
    private String threadname;


    public RunnableDemo(String name)
    {
      this.threadname=name;
      System.out.println("craeting Thread "+ threadname);
    }
    

    public void run()
    {
        System.out.println(" ruunning "+ threadname);
        try{
             for(int i=5;i>0;i--)
             {
                 System.out.println(" Thread  "+threadname +"  " + i);
                 Thread.sleep(100);
             }
        }
        catch(Exception i)
        {
          System.out.println("Thread "+threadname +" Interpretted");

        }
        System.out.println("Thread "+ threadname+" existing");
    }

    public void start()
    {
        System.out.println("Starting "+threadname);
        if(thread==null)

        {
            thread=new Thread(this, threadname);
            thread.start();

        }
    }

}
public class Threadtestdemo 
{
    public static void main(String args[])
    {
      RunnableDemo runnable =new RunnableDemo("Thread-1");
      runnable.start();
      RunnableDemo runnable1=new RunnableDemo("Thread-2");
      runnable1.start();
    }
    
}
