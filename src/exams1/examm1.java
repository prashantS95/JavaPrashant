package exams1;
import java.util.*;

public class examm1 {


    public static void main(String args[])
    {
  int i,j=0,n=999,a,b,c,d,e;
  System.out.println("\nArmstromg number betweeen 100 to 999 are:");
  for(i=100;i<n;i++)
  {
    a=i/10;
    b=i%10;
    c=a/10;
    d=a%10;
    b=b*b*b;
    c=c*c*c;
    d=d*d*d;
    e=b+c+d;
    if(i==e)
    {
      
      System.out.println(i);
    }
  }
  
  
}
    
}
