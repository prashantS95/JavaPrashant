package StudentCollection;
import java.util.*;

public class Student {
    public static void main(String args[])
    {
        try{
   // PriorityQueue pq=new PriorityQueue();
   LinkedList pq=new LinkedList();
    /*{Scanner sc=new Scanner(System.in);
        
        for(int i=1;i<=2;i++)
        {
        System.out.print("Enter name of "+ i +" Student :");
        String s=sc.next();

       
        }
            
    }*/
    pq.add("jxb");
    pq.add(6);
    System.out.println(pq);}
    catch(Exception i)
    {
        System.out.println(i);
    }


    }
}
