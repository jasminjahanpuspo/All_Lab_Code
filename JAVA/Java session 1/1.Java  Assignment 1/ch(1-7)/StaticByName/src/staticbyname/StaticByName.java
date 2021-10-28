package staticbyname;

public class StaticByName {
    public static void main(String[] args) {
        staticDemo.callme();
        System.out.println("b= "+staticDemo.b);
    }    
}
class staticDemo{
    static int a=42;
    static int b=99;
    
    static void callme(){
        System.out.println("a= "+a);
    }
}
