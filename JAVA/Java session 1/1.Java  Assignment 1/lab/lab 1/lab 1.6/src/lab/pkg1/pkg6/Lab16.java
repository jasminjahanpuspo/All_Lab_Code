package lab.pkg1.pkg6;

public class Lab16 {
    public static void main(String[] args) {
        MyCalculator m=new MyCalculator();
        m.sum(3,7);
        m.pro(3,2);
    }    
}
class MyCalculator{
    void sum(int a,int b){
    int sum=0;
    sum=a+b;
        System.out.println("Sum Value="+sum);
   }
    void pro(int a,int b){
    int pro=a*b;
        System.out.println("Product Value="+pro);
   }
}
