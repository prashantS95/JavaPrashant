package ThreadLight;

public class Light {
    public static void main(String args[])
    {
        ThreadG t1=new ThreadG(" GREEN ");
        ThreadR t2=new ThreadR("RED");
        ThreadY t3=new ThreadY("YELLOW");
        t1.start();
        t2.start();
        t3.start();

    }
    
}
