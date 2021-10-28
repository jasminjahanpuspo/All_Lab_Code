package overload.pkg2;

public class Overload2 {
    public static void main(String[] args) {
        overloadDemo ob=new overloadDemo();
        int i=88;
        
        ob.test();
        ob.test(10,20);
        
        ob.test(i);
        ob.test(123.2);
    }
    
}
class overloadDemo{
    void test(){
        System.out.println("No paremeters");
    }    
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a){
        System.out.println("doble a: "+a);
        return a*a;
    }   
            
}
