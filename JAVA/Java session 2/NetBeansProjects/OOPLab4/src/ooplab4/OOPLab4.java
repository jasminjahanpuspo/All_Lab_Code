
package ooplab4;

import mypackage.MyClass;


public class OOPLab4 {
    
    public OOPLab4() {
        int n=10;
        int r=fact(n);
        System.out.println("fact="+r);
    }
    public int fact(int n) {
        if(n==1) {
            return 1;
        } 
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        OOPLab4 obj=new OOPLab4();
//        B b=new B();
//        MyClass m=new MyClass();
    }
    
}


class A {
    
}