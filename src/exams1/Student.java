package exams1;

public class Student {
    
    private String Fname;
    private String Lname;
    private String Msub;
    private int clsyer;
   
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    public String getFname(){
        return Fname ;
    }
   
     public void setLname(String Lname){
        this.Lname=Lname;
    }
    public String getLname(){
        return Lname;
    }
     public void setMsub(String Msub){
        this.Msub=Msub;
    }
    public String getMsub(){
        return Msub;
    }
   
     public void setClsyer( int clsyer){
        this.clsyer=clsyer;
    }
    public int  getClsyer(){
        return clsyer;
    }
    public void display(){
        System.out.println("First name is = " + Fname);
        System.out.println("Last name is = " + Lname);
        System.out.println("main subject  is = " + Msub);
        System.out.println("class year   is = " + clsyer);
    }
}
class student2{
    private String Fname;
    private String Lname;
    private String  Msub;
    private int clsyer;
   
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    public String getFname(){
        return Fname;
    }
   
     public void setLname(String Lname){
        this.Lname=Lname;
    }
    public String getLname(){
        return Lname;
    }
     public void setMsub(String Msub){
        this.Msub=Msub;
    }
    public String getMsub(){
        return Msub;
    }
   
     public void setClsyer( int clsyer){
        this.clsyer=clsyer;
    }
    public int  getClsyer(){
        return clsyer;
    }
    public void display(){
        System.out.println("First name is =  " + Fname);
        System.out.println("Last name is = " + Lname);
        System.out.println("main subject  is = " + Msub);
        System.out.println("class year   is = " + clsyer);
    }
}
class Students {
    public static void main(String[] args) {
        Student s1=new Student();
        
        System.out.println("\n Info of Student 1 is \n ");
        s1.setFname(" Prashant ");
        s1.setLname(" Sable ");
        s1.setMsub("Maths");
        s1.setClsyer(22);
        s1.display();
        System.out.println(" \n");
        System.out.println("Info of student 2 is \n ");
        student2 s2=new student2();
        s2.setFname(" Dinesh ");
        s2.setLname(" Ghunawat ");
        s2.setMsub(" Science ");
        s2.setClsyer(22);
        s2.display();
    }
}

