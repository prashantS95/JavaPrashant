package Listss;
import java.util.*;

public class Arraylistdemo {
    public static void main(String args[])
    {
        ArrayList <String> arr=new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
            
        }
    }
    

