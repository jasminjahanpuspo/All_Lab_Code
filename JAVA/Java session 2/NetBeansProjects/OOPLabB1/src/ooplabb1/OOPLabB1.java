package ooplabb1;

public class OOPLabB1 {
    
    public static void main(String[] args) {
        CSE cs=new CSE();
        ENG en=new ENG();
        cs.name="Mr. Okada";
        cs.reg=234;
        en.name="Mr. Honda";
        en.reg=123;
        
        cs.doGraduation();
        cs.doProgramming();
        en.doGraduation();
        en.doLiterature();
        cs.info();
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
        name="hhh";
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
