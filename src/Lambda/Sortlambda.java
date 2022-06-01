package Lambda;
import java.util.*;
class product
{
    int id;
    String name;
    float price;
    int warrenty;
    public product(int id,String name,float price,int warrenty)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.warrenty=warrenty;

    }
}

public class Sortlambda 
{public static void main(String args[])
    {
        List<product> list=new ArrayList<>();
    
        list.add(new product(1,"Dell", 50000, 2));
        list.add(new product(2, "Apple", 100000, 3));
        list.add(new product(3, "Zab", 53420, 1));

        System.out.println("Sorting on the basis of name");
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
    });
    for(product p:list){
        System.out.println(p.id+""+p.name+""+p.price+""+p.warrenty);
    }
        


  }


}

    

