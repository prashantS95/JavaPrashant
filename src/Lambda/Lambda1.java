package Lambda;
interface drawable
{
    public void draw();
}
public class Lambda1 {
    public static void main(String args[])
    {
        drawable d2=()->{
           int w=10;
            System.out.println("Width="+w);
            /*without lambda
            int w=10;
            drawable d=new drawable()
            {
                System.out("width"+w); 
                System.out.println("");
            }


            */

        };
        d2.draw();

    }
    
}
