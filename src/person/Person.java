package person;

public class Person {
    String fname;
    String lname;
    public void Finame(String fname)
    {
        this.fname=fname;
        System.out.println(" First name is"+fname);
    }
    public void Lastname(String lname)
    {
        this.lname=lname;
        System.out.println("last name ="+lname);
    }
    

    
public static void main(String args[])
{
    Person p=new Person();
    p.Finame("ABCDEF");
    p.Lastname("Teacher");
}
}