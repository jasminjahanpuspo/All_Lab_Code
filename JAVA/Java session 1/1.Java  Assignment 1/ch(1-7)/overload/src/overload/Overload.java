package overload;

public class Overload {
    public static void main(String[] args) {
        overloadDemo ob=new overloadDemo(); 
        double result;
        
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.25);
        System.out.println("result "+result);
    }    
}

class overloadDemo{
    void test(){
        System.out.println("No paremeters");
    }
    void test(int a){
        System.out.println("a:"+a);
    }
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a){
        System.out.println("doble a: "+a);
        return a*a;
    }
    
            
}
