package lab.pkg2.pkg1;

public class Lab21 {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.on();
        c.off();
    }    
}
class Computer{
    int fan=4,cpu=2;
    public void on(){       
        System.out.println("Pc Start");
        startfan();
        beep();
        startfan(4);        
    }
    public void off(){        
        System.out.println("Pc Stop");
        stopfan();
        beep();        
    }
    private void startfan(){
        System.out.println("Fan Start.");
    }
    private void stopfan(){
        System.out.println("Fan Stop.");
    }
    private void beep(){
        System.out.println("Beep.....");
    }
    private void startfan(int a){
        System.out.println("Fan Start "+a+"seconds ago.");
    }
    
}
