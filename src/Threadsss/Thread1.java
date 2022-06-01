package Threadsss;

public class Thread1 extends Thread {      //or implements Runnable   or extends Thread
    public void run()
    {
        System.out.println("Yhread is running....");

    }
    
    public static void main(String args[])
    {
        Thread1 t=new Thread1();
       t.run();

      //Thread s=new Thread(t);  //when we not extends thread
        //s.start();


    }
}
