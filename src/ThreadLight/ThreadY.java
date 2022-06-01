package ThreadLight;

public class ThreadY extends Thread {
    String y="";
    ThreadY(String y)
    {
        this.y=y;
    }
    public void run()
    {
        try 
        {/*for(int i=0;i<=2;i++)
            {
            if(i==2)
           
                {*/System.out.println(y);
                Thread.sleep(100000000);

            }
        //}}
        catch(Exception i)
        {
          i.printStackTrace();
        }
    }
    
}
