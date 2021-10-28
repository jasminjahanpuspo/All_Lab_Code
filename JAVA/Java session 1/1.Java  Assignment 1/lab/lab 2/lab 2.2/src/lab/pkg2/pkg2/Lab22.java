package lab.pkg2.pkg2;

public class Lab22 {
    public static void main(String[] args) {
       A aa=new A();
       B bb=new B();
       
       aa.info();
       bb.dojob(aa);
       aa.info();
       bb.dojob2(aa.v);
       aa.info();
    }    
}

class A{
    int v=0;
    void info(){
        System.out.println(v);
    }
}
class B{
    int v=2;
    void dojob(A a){
        a.v=1;        
    }
    void dojob2(int a){
        a=5;
    }
}