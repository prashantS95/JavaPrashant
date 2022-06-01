package person;

public class Teacher extends Person
{
double salery;
int stryear;
int yrexp;
public void Salery(double salery)
{
    this.salery=salery;
    System.out.println("Salery ="+salery);

}
public void stryear(int stryear)
{
    this.stryear=stryear;
    System.out.println("Starting year is"+stryear);
}
public void Yrexp(int yrexp)
{
    this.yrexp=yrexp;
    System.out.println("Year of Experience ="+yrexp);
}

public static void main(String args[])
{
    Teacher t=new Teacher();
    t.Finame("ABCD ");
    t.Lastname("Teacher");
    t.Salery(54352.5);
    t.stryear(2000);
    t.Yrexp(22);

}
    
}
