package StudentCollection;

import java.util.concurrent.*;
import java.util.*;
import java.io.*;


public class ScheduledExecutor {
    public static void main(String args[])
    {
     System.out.println("A count down program that contains from 0 to 10");
     ScheduledExecutorService schedule=Executors.newScheduledThreadPool(10);;
     System.out.println("Current time :"+Calendar.getInstance().get(Calendar.SECOND));

     for(int i=10;i>=0;i--)
     {
         schedule.schedule(new Task(i),10-i,TimeUnit.SECONDS);
     }
     schedule.shutdown();
    }
    static  class Task implements Runnable{
        private int num;
        public Task (int num){
            this.num=num;
        }
        public void run(){
            System.out.println("Number " + num+" Current time " + Calendar.getInstance().get(Calendar.SECOND));
        }
    }
}


