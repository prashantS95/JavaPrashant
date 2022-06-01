package Lambda;
interface draw{
    public void main(String name,String working);
    }



public class lambdainterfacemethod {

    public static String main(String args[])
    {
        draw a=(name,working)->
        {
            return "Hello"+name+"It  is "+working+" ";
        };
    }
    
}
