package ThreadLight;

public class ThreadG extends Thread {
    String c="";
    ThreadG(String c)
    {
        this.c=c;
    }
    public void run()
    {
        try 
        {/*for(int i=0;i<=2;i++)
            {
                System.out.println("...");
            if (i==2)
            {

            */
                System.out.println(c);
                Thread.sleep();

                

            //}

           
       // }
    }
        catch(Exception i)
        {
          i.printStackTrace();
        }
    }
    
}
