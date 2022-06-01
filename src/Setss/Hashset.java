package Setss;
import java.util.*;

public class Hashset {
    public static void main(String args[])
    {
        HashSet<String>hs=new HashSet();
        hs.add("wege");
        hs.add("Adfdzx");
        hs.add(" ");
        hs.add("eqr");
        hs.add("eqr");
        //System.out.println(hs);
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        HashSet<String>hs1=new HashSet<>();
        hs1.addAll(hs);
       
        hs1.add(" ");
        hs1.add("1");
        hs1.add("2");
        System.out.println(hs1);
        boolean value1=hs1.remove("2");
        System.out.println("   is 2 remove"+value1);
        System.out.println(hs1);
        
        boolean value2=hs.removeAll(hs);
        System.out.println("IS hs removed "+value2);
        System.out.println(hs);







    }
    
}
