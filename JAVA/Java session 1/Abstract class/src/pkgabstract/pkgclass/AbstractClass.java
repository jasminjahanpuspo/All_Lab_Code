package pkgabstract.pkgclass;

public class AbstractClass {

    public static void main(String[] args) {
        Device d=new Computer();
        d.info();
    }

}
abstract class Device{
    abstract public void info();
}
class Computer extends Device{
    public void info(){
        System.out.println("hi");
    }
}
