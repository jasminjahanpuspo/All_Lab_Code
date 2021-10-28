package lab.pkg3.pkg4;

public class Lab34 {
    public static void main(String[] args) {
       CSE cs=new CSE();        
        cs.name="puspo";
        cs.reg=34;
        cs.doGraduation();
        cs.doProgramming();
        cs.info();
        
        ENG en=new ENG();
        en.name="xyz";
        en.reg=33;       
        en.doGraduation();
        en.doLiterature();
        en.info(); 
    }    
}
abstract class GeneralStudent {
    String name;
    int reg;
    public void info() {
        System.out.println("I am a student");
    }
    abstract public void doGraduation() ;
}

class CSE extends GeneralStudent{
    
    public void doGraduation() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println("Graduated in CSE");
    }
    public void doProgramming() {
        System.out.println("programming");
    } 
}

class ENG extends GeneralStudent{
    
    public void doGraduation() {
        System.out.println(name);
        System.out.println(reg);
        System.out.println("Graduated in ENG");
    }
    public void doLiterature() {
        System.out.println("literature");
    } 
}

