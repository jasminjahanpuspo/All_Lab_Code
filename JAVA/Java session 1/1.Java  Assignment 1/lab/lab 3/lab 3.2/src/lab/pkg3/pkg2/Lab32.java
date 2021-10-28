package lab.pkg3.pkg2;

public class Lab32 {
    public static void main(String[] args) {
        Cse cs=new Cse();
        cs.name="puspo";
        cs.reg=34;        
        cs.dograduate();
        cs.doprogram();
        cs.info();
        
        Eng en=new Eng();
        en.name="xyz";
        en.reg=34;        
        en.dograduate();
        en.literature();
        en.info();               
       
    }    
}

class generalstudents{
    String name;
    int reg;
     public void info(){
        System.out.println("I am student.");
    }
}

class Cse extends generalstudents{
    public void dograduate(){
        System.out.println(name);
        System.out.println(reg);
        System.out.println("CSE graduated.");
    }
    public void doprogram(){
        System.out.println("Programming.");
    }
}
class Eng  extends generalstudents{
    public void dograduate(){
        System.out.println(name);
        System.out.println(reg);
        System.out.println("ENG graduated.");
    }
    public void literature(){
        System.out.println("Literature.");
    }
}

