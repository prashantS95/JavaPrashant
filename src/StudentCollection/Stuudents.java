package StudentCollection;
import java.util.*;
public class Stuudents {
    public static void main(String args[])
    {
       // PriorityQueue<String> pq=new PriorityQueue<>();
        //PriorityQueue<Integer>ab=new PriorityQueue<>();
        LinkedList pq=new LinkedList();
        Scanner sc=new Scanner(System.in);

        
        for(int i=1;i<=2;i++)
        {System.out.print("Enter name of "+ i +" Student :");
            String s=sc.next();
            System.out.print(" Enter Marks  =");
            int t=sc.nextInt();
            
           String x=s+t;
           //System.out.println(x);
           //pq.add(x);
           //System.out.println("Name of Student "+i+"is = "+s);
           //System.out.println("Marks od student is ="+t);
           pq.add(x);
          /* Iterator itr=pq.iterator();
           while(itr.hasNext())
           {
               System.out.println(itr.next());
           }*/
               //System.out.println(""+"\n\n\n");
               
              // LinkedList ab=new LinkedList();
           //ab.add(pq);
              
           System.out.println(pq);
           if(t>=75)
           {   
               pq.remove(x);
               System.out.println("Studennts remaining for Placement");
               System.out.println(pq);
               /*Iterator da=pq.iterator();
               while(itr.hasNext())
               {
                   System.out.println(da.next());
               }*/
           }
           
           /*if(t<=75)
           {
               pq.remove(x);
               System.out.println("Placed Students");
               System.out.println(ab);
           }*/
         //  LinkedList ab=new LinkedList();
           //ab.addAll(pq);
    
    }
  
   

        
        //pq.add(s);
      //  System.out.println(pq);
       //System.out.println(pq+"="+ab);
    
        //System.out.println(ab);
       /* Iterator itr=pq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator xy=ab.iterator();
        while(xy.hasNext())
        {
            System.out.println(xy.next());
        }
        System.out.println(itr+" "+xy);
        */

      //  SortedSet<String>y=new TreeSet<>();
        //y.addAll(pq);
        //y.addAll(ab);
        //System.out.println(y);
            
       // ;
    }
    
}
