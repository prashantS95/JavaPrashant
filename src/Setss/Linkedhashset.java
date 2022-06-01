package Setss;
import java.util.*;

public class Linkedhashset {
    public static void main(String args[])
    {
      LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
      lhs.add(1);
      lhs.add(2);
      lhs.add(3);
      lhs.add(9);
      lhs.add(0);
      lhs.add(0);
      //lhs.remove(3);
      System.out.println(lhs);
      lhs.remove(3);
      //lhs.notify();
      System.out.println(lhs);
      HashSet<Integer> i=new HashSet<>();
      i.addAll(lhs);
      i.remove(9);
      System.out.println(i);
      



    }
    
}
