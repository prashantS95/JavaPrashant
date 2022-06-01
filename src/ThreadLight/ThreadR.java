package ThreadLight;

public class ThreadR extends Thread {
    String r="";
    ThreadR(String r)
    {
        this.r=r;
    }
    public void run()
    {
        try 
        {
        /*for(int i=0;i<=2;i++)
            {
            if (i==2)
            {
            */
            
                System.out.println(r);
                Thread.sleep(3000000);

            
        }//}}
        catch(Exception i)
        {
          i.printStackTrace();
        }
    }
    
}
