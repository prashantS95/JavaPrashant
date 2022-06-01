package Listss;
import java.util.*;

public class PriotrityQueue {
    public static void main(String args[])
    {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add(" ABC");
        pq.add("BBC");
        pq.add("CCD");
        pq.add("AAB");
        pq.add("AXY");
        System.out.println("Head"+pq.element());
        System.out.println("Head"+pq.peek());
        System.out.println("Interating the queue element");
        Iterator itr=pq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        pq.remove();
        pq.poll();//alphabetical  
        System.out.println("After removing two elements");
        Iterator<String>itr2=pq.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

    }
    
}
