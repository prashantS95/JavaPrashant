package Listss;
import java.util.*;

public class Arraylistremove {
    public static void main(String args[])
    {
        ArrayList<Integer> In=new ArrayList<Integer>();
        try{
          int i;
        for(i=0;i<=100;i++)
        {
          In.add(i);
          //System.out.println(In);
        }
        System.out.println(In);
        for (i=0;i<In.size();i++)
        {
          In.remove(i);
         // System.out.println(In);

        }
        System.out.println(In);


        
         /*while(i%2!=0)
          {
             // In.remove(i);
              System.out.println(In);
          }*/
         

          
        }
        
      
      catch(Exception i)
      {
         System.out.println(i);
      }
    }
  
  }
        
      //  In.remove(x%2);
       // System.out.println(In);
        

    
    

