package lab.pkg3.pkg1;

public class Lab31 {
    public static void main(String[] args) {
        Cse cs=new Cse();
        cs.doprogram();
        cs.dograduate();
        cs.info();
        
        Eng en=new Eng();
        en.dograduate();
        en.literature();
        en.info();
    }    
}
class Cse{
    String name="puspo";
    int reg=34;
    public void doprogram(){
        System.out.println("Programming.");
    }
    public void dograduate(){
        System.out.println(name);
        System.out.println(reg);
        System.out.println("CSE graduated.");
    }
    public void info(){
        System.out.println("I am student.");
    }
}

class Eng{
    String name="xyz";
    int reg=97;
    public void literature(){
        System.out.println("Literature.");
    }
    public void dograduate(){
        System.out.println(name);
        System.out.println(reg);
        System.out.println("ENG graduated.");
    }
    public void info(){
        System.out.println("I am student.");
    }
}

